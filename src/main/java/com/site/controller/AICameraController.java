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
import org.springframework.web.bind.annotation.RestController;

import com.site.entity.AICameraEntity;
import com.site.service.AICameraService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(path = "/safesite")
public class AICameraController {

	@Autowired
	private AICameraService service;
	
	
	
	
	
	

	@PostMapping("/insertAICamera")
	public ResponseEntity<AICameraEntity> insertDetails(@RequestBody AICameraEntity cameraEntity) {
		log.info("In AICameraController...registerAICameraDetails() method Register");
		try {

			log.info("In AICameraController...registerAICameraDetails() method Started");
			AICameraEntity entity = service.saveOrUpdateDetails(cameraEntity);
			return new ResponseEntity<>(entity, HttpStatus.OK);

		} catch (Exception e) {

			log.error("In AICameraController...registerAICameraDetails() method error message accured");
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PutMapping("/update")
	public ResponseEntity<AICameraEntity> updateDetails(@RequestBody AICameraEntity cEntity) {

		log.info("In AICameraController...updateDetails() method Register");
		try {
			log.info("In AICameraController...updateDetails() method Started");
			AICameraEntity entity = service.saveOrUpdateDetails(cEntity);
			return new ResponseEntity<>(entity, HttpStatus.OK);
		} catch (Exception e) {

			log.error("In AICameraController...updateDetails() method error message accured");
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/getAllCamerasDetails")
	public ResponseEntity<List<AICameraEntity>> getAllCameras() {
		log.info("In AICameraController...getAllCameras() method Register");
		try {
			log.info("In AICameraController...getAllCameras() method Started");
			List<AICameraEntity> entity = service.getAllCameraDetails();
			return new ResponseEntity<>(entity, HttpStatus.OK);

		} catch (Exception e) {

			log.error("In AICameraController...getAllCameras() method error message accured");
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/aiCamera/{cameraId}")
	public AICameraEntity getCamera(@PathVariable("cameraId") String cameraId) {
		
		
		return service.getCamera(cameraId);
	}

	
}
