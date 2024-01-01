package com.site.serviceimpl;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dto.AiCameraDto;
import com.site.dto.CameraDto;
import com.site.dto.EnvironmentDto;
import com.site.dto.EnvironmentSensorDto;
import com.site.dto.FloodDto;
import com.site.dto.FloodSensorDto;
import com.site.dto.ZoneDTO;
import com.site.dto.ZoneResponceDTO;
import com.site.dto.ZonesDTO;
import com.site.entity.AICameraEntity;
import com.site.entity.SensorEntity;
import com.site.repository.AICameraRepository;
import com.site.repository.SensorRepository;
import com.site.service.ZoneService;

@Service
public class ZoneServiceImpl implements ZoneService {

	@Autowired
	AICameraRepository repository;

	@Autowired
	SensorRepository sensorRepo;

	public static final String aicamera_table = "aicamera_table";
	public static final String sensor_table = "sensor_table";

	public ZoneResponceDTO getAllZone() {

		ZoneResponceDTO responceDTO = new ZoneResponceDTO();

		AiCameraDto dto = new AiCameraDto();
		EnvironmentSensorDto eDTO = new EnvironmentSensorDto();
		FloodSensorDto fDTO = new FloodSensorDto();

		List<AICameraEntity> aiEntity = repository.getCameraZone(aicamera_table);
		List<SensorEntity> sEntity = sensorRepo.getCameraZone(sensor_table);
		List<SensorEntity> fEntity = sensorRepo.getCameraZone(sensor_table);

		if (!aiEntity.isEmpty()) {
			List<CameraDto> cDtoList = new ArrayList<>();
			for (AICameraEntity entity : aiEntity) {
				CameraDto cDTO = new CameraDto();
				cDTO.setCameraId(entity.getCameraId());
				cDTO.setCameraLocation(entity.getCameraLocation());
				cDTO.setCameraName(entity.getCameraName());
				cDTO.setCameraZone(entity.getCameraZone());
				cDTO.setMotion(entity.getMotion());
				cDTO.setConnectivityStrength(entity.getConnectivityStrength());
				cDtoList.add(cDTO);

			}
			dto.setCount(aiEntity.size()); // dto.setList(cDtoList);

		}

		if (!sEntity.isEmpty()) {
			List<EnvironmentDto> enviDTOList = new ArrayList<>();
			for (SensorEntity entity : sEntity) {
				EnvironmentDto envDto = new EnvironmentDto();
				envDto.setSensorId(entity.getSensorId());
				envDto.setSensorName(entity.getSensorName());
				envDto.setBattery(entity.getBattery());
				envDto.setSensorType(entity.getSensorType());
				envDto.setSensorZone(entity.getSensorZone());
				envDto.setSensorLocation(entity.getSensorLocation());
				envDto.setConnectvityStrength(entity.getConnectvityStrength());
				envDto.setCarbonMonaxide(entity.getCarbonMonaxide());
				envDto.setLight(entity.getLight());
				envDto.setParticulate(entity.getParticulate());
				envDto.setPressure(entity.getPressure());
				envDto.setRainfall(entity.getRainfall());
				envDto.setTemperature(entity.getTemperature());
				envDto.setHumidity(entity.getHumidity());
				envDto.setVoc(entity.getVoc());
				envDto.setMotion(entity.getMotion());
				envDto.setNoise(entity.getNoise());
				envDto.setWaterLevel(entity.getWaterLevel());
				enviDTOList.add(envDto);

			}
			eDTO.setCount(sEntity.size()); // eDTO.setList(enviDTOList);

		}
		if (!fEntity.isEmpty()) {
			List<FloodDto> floodDtoList = new ArrayList<>();
			for (SensorEntity entity : fEntity) {
				FloodDto flDto = new FloodDto();
				flDto.setSensorId(entity.getSensorId());
				flDto.setSensorName(entity.getSensorName());
				flDto.setBattery(entity.getBattery());
				flDto.setSensorType(entity.getSensorType());
				flDto.setSensorZone(entity.getSensorZone());
				flDto.setSensorLocation(entity.getSensorLocation());
				flDto.setConnectvityStrength(entity.getConnectvityStrength());
				flDto.setCarbonMonaxide(entity.getCarbonMonaxide());
				flDto.setLight(entity.getLight());
				flDto.setParticulate(entity.getParticulate());
				flDto.setPressure(entity.getPressure());
				flDto.setRainfall(entity.getRainfall());
				flDto.setTemperature(entity.getTemperature());
				flDto.setHumidity(entity.getHumidity());
				flDto.setVoc(entity.getVoc());
				flDto.setMotion(entity.getMotion());
				flDto.setNoise(entity.getNoise());
				flDto.setWaterLevel(entity.getWaterLevel());
				floodDtoList.add(flDto);

			}
			fDTO.setCount(sEntity.size()); // fDTO.setList(floodDtoList);;

		}

		ZoneDTO zDTO = new ZoneDTO();
		zDTO.setAiCamera(dto);
		zDTO.setEnvironmentSensor(eDTO);
		zDTO.setFloodSensor(fDTO);
		zDTO.setZoneName("zone1");
		responceDTO.setZone(zDTO);
		return responceDTO;
	}

	@Override
	public ZonesDTO getAICameraDetails() {
		ZonesDTO zonesData = new ZonesDTO();

		List<AICameraEntity> list = repository.findAll();
		List<String> zones = list.stream().map(a -> a.getCameraZone()).collect(Collectors.toList());
		Set<String> zoneNames = new LinkedHashSet<>(zones);
		zonesData.setCount(zoneNames.size());
		List<ZoneDTO> zonesList = new ArrayList<>();
		List<SensorEntity> senorsList = StreamSupport.stream(sensorRepo.findAll().spliterator(), false)
				.collect(Collectors.toList());

		for (String zone : zoneNames) {
			ZoneDTO zoneDTO = new ZoneDTO();
			zoneDTO.setZoneName(zone);
			AiCameraDto aiCameraDto = new AiCameraDto();

			zoneDTO.setAiCamera(aiCameraDto);

			String zoneNumber = zone.split("zone")[0];
			String search = "AICamera#" + zoneNumber;
			List<AICameraEntity> zoneList = list.stream().filter(a -> a.getCameraName().equalsIgnoreCase(search))
					.collect(Collectors.toList());
			aiCameraDto.setList(zoneList);
			aiCameraDto.setCount(zoneList.size());
			zoneDTO.setAiCamera(aiCameraDto);
			zonesList.add(zoneDTO);

			EnvironmentSensorDto environmentSensorDto = new EnvironmentSensorDto();
			String serachSens = "EnvironmentSensor#" + zoneNumber;
			List<SensorEntity> sensorsList = senorsList.stream()
					.filter(s -> s.getSensorName().equalsIgnoreCase(serachSens)).collect(Collectors.toList());
			environmentSensorDto.setCount(sensorsList.size());
			environmentSensorDto.setList(sensorsList);

			zoneDTO.setEnvironmentSensor(environmentSensorDto);

			FloodSensorDto floodSensorDto = new FloodSensorDto();
			String serachFlood = "FloodSensor#" + zoneNumber;
			List<SensorEntity> floodsList = senorsList.stream()
					.filter(s -> s.getSensorName().equalsIgnoreCase(serachFlood)).collect(Collectors.toList());
			floodSensorDto.setCount(floodsList.size());
			floodSensorDto.setList(floodsList);

			zoneDTO.setFloodSensor(floodSensorDto);

		}
		zonesData.setZonesList(zonesList);
		zonesData.setCount(zonesList.size());
		return zonesData;
	}

}
