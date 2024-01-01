package com.site.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.dto.Alerts;
import com.site.dto.Events;
import com.site.dto.NotificationDTO;
import com.site.dto.NotificationFieldsDTO;
import com.site.dto.NotificationResponceDTO;
import com.site.dto.Operations;
import com.site.entity.NotificationEntity;
import com.site.repository.NotificationRepository;
import com.site.service.NotificationService;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private NotificationRepository repository;
	
	
	public static final String Event = "Event";
	public static final String Alert = "Alert";
	public static final String Operation = "Operation";

	
	@Override
	
	public NotificationResponceDTO getAllNotification() {

		NotificationResponceDTO responceDTO=new NotificationResponceDTO();
		
		Events event = new Events();
		Alerts alert = new Alerts();
		Operations opt = new Operations();

		List<NotificationEntity> eventList = repository.notificationType(Event);
		List<NotificationEntity> alertList = repository.notificationType(Alert);
		List<NotificationEntity> optList = repository.notificationType(Operation);

		if (!eventList.isEmpty()) {
			List<NotificationFieldsDTO> notificationDTOList = new ArrayList<>();
			for (NotificationEntity entity : eventList) {
				NotificationFieldsDTO notificationDTO=new NotificationFieldsDTO();
				notificationDTO.setNotificationId(entity.getNotificationId());
				notificationDTO.setNotificationType(entity.getNotificationType());
				notificationDTO.setNotificationZone(entity.getNotificationZone());
				notificationDTO.setSensorId(entity.getSensorId());
				notificationDTO.setSensorName(entity.getSensorName());
				notificationDTO.setCameraId(entity.getCameraId());
				notificationDTO.setCameraName(entity.getCameraName());
				notificationDTO.setBattery(entity.getBattery());
				notificationDTO.setCarbonMonaxide(entity.getCarbonMonaxide());
				notificationDTO.setConnectvityStrength(entity.getConnectvityStrength());
				notificationDTO.setDateAndTime(entity.getDateAndTime());
				notificationDTO.setHumidity(entity.getHumidity());
				notificationDTO.setLight(entity.getLight());
				notificationDTO.setLocation(entity.getLocation());
				notificationDTO.setNoise(entity.getNoise());
				notificationDTO.setMotion(entity.getMotion());
				notificationDTO.setParticulate(entity.getParticulate());
				notificationDTO.setPressure(entity.getPressure());
				notificationDTO.setRainfall(entity.getRainfall());
				notificationDTO.setReason(entity.getReason());
				notificationDTO.setTemperature(entity.getTemperature());
				notificationDTO.setVoc(entity.getVoc());
				notificationDTO.setWaterLevel(entity.getWaterLevel());
				notificationDTOList.add(notificationDTO);
				}
			event.setEventsList(notificationDTOList);
			event.setEventCount(eventList.size());

		}
		if (!alertList.isEmpty()) {
			List<NotificationFieldsDTO> notificationDTOList = new ArrayList<>();
			for (NotificationEntity entity : alertList) {
				NotificationFieldsDTO notificationDTO=new NotificationFieldsDTO();
				notificationDTO.setNotificationId(entity.getNotificationId());
				notificationDTO.setNotificationType(entity.getNotificationType());
				notificationDTO.setNotificationZone(entity.getNotificationZone());
				notificationDTO.setSensorId(entity.getSensorId());
				notificationDTO.setSensorName(entity.getSensorName());
				notificationDTO.setBattery(entity.getBattery());
				notificationDTO.setCameraId(entity.getCameraId());
				notificationDTO.setCameraName(entity.getCameraName());
				notificationDTO.setCarbonMonaxide(entity.getCarbonMonaxide());
				notificationDTO.setConnectvityStrength(entity.getConnectvityStrength());
				notificationDTO.setDateAndTime(entity.getDateAndTime());
				notificationDTO.setHumidity(entity.getHumidity());
				notificationDTO.setLight(entity.getLight());
				notificationDTO.setLocation(entity.getLocation());
				notificationDTO.setNoise(entity.getNoise());
				notificationDTO.setMotion(entity.getMotion());
				notificationDTO.setParticulate(entity.getParticulate());
				notificationDTO.setPressure(entity.getPressure());
				notificationDTO.setRainfall(entity.getRainfall());
				notificationDTO.setReason(entity.getReason());
				notificationDTO.setTemperature(entity.getTemperature());
				notificationDTO.setVoc(entity.getVoc());
				notificationDTO.setWaterLevel(entity.getWaterLevel());
				notificationDTOList.add(notificationDTO);
				}
			alert.setAlertsList(notificationDTOList);
			alert.setAlertCount(alertList.size());

		}
		if (!optList.isEmpty()) {
			List<NotificationFieldsDTO> notificationDTOList = new ArrayList<>();
			for (NotificationEntity entity : optList) {
				NotificationFieldsDTO notificationDTO=new NotificationFieldsDTO();
				notificationDTO.setNotificationId(entity.getNotificationId());
				notificationDTO.setNotificationType(entity.getNotificationType());
				notificationDTO.setNotificationZone(entity.getNotificationZone());
				notificationDTO.setSensorId(entity.getSensorId());
				notificationDTO.setBattery(entity.getBattery());
				notificationDTO.setSensorName(entity.getSensorName());
				notificationDTO.setCameraId(entity.getCameraId());
				notificationDTO.setCameraName(entity.getCameraName());
				notificationDTO.setCarbonMonaxide(entity.getCarbonMonaxide());
				notificationDTO.setConnectvityStrength(entity.getConnectvityStrength());
				notificationDTO.setDateAndTime(entity.getDateAndTime());
				notificationDTO.setHumidity(entity.getHumidity());
				notificationDTO.setLight(entity.getLight());
				notificationDTO.setLocation(entity.getLocation());
				notificationDTO.setNoise(entity.getNoise());
				notificationDTO.setMotion(entity.getMotion());
				notificationDTO.setParticulate(entity.getParticulate());
				notificationDTO.setPressure(entity.getPressure());
				notificationDTO.setRainfall(entity.getRainfall());
				notificationDTO.setReason(entity.getReason());
				notificationDTO.setTemperature(entity.getTemperature());
				notificationDTO.setVoc(entity.getVoc());
				notificationDTO.setWaterLevel(entity.getWaterLevel());
				notificationDTOList.add(notificationDTO);
				}
			opt.setOperationsList(notificationDTOList);
			opt.setOptCount(optList.size());

		}
		NotificationDTO notification = new NotificationDTO();    
		notification.setEvents(event);                          
		notification.setAlerts(alert);                          
		notification.setOperations(opt);                   
		responceDTO.setNotification(notification);;
		return responceDTO;
		
	}
	@Override
	public NotificationEntity saveOrUpdateDetails(NotificationEntity notificationEntity) {
		return repository.save(notificationEntity);
	}


}
