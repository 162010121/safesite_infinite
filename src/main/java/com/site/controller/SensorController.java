package com.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.site.entity.SensorEntity;
import com.site.repository.SensorRepository;
import com.site.service.SensorService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(path = "/safesite")
public class SensorController {

	@Autowired
	private SensorService service;

	@Autowired
	private SensorRepository repository;

	@PostMapping("/insertSensors")
	public ResponseEntity<SensorEntity> insertDetails(@RequestBody SensorEntity entity) {

		log.info("In SensorController...insertrDetails() method strated");
		try {

			log.info("In SensorController...insertDetails() method register");
			SensorEntity sensorEntity = service.saveOrUpdate(entity);
			return new ResponseEntity<>(sensorEntity, HttpStatus.OK);
		} catch (Exception e) {

			log.error("In SensorController...insertDetails() method error message accured");
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PutMapping("/updateSensors")
	public ResponseEntity<SensorEntity> updateDetails(@RequestBody SensorEntity enity) {
		log.info("In SensorController...updateDetails() method strated ");
		try {

			log.info("In SensorController...UpdateDetails() method register");
			SensorEntity sEntity = service.saveOrUpdate(enity);
			return new ResponseEntity<>(sEntity, HttpStatus.OK);

		} catch (Exception e) {

			log.error("In SensorController...updateDetails() method error message accured");

			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/getSensorDetails/{sensorId}")
	public SensorEntity getById(@PathVariable("sensorId") String sensorId) {
		SensorEntity entity = service.getById(sensorId);

		return entity;

	}

	@GetMapping("/getSensor/{sensorType}")
	public ResponseEntity<List<SensorEntity>> getSensorType(@RequestParam String sensorType) {
		return new ResponseEntity<List<SensorEntity>>(repository.findBySensorType(sensorType), HttpStatus.OK);
	}

}
