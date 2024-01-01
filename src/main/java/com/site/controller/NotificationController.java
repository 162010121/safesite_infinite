package com.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.site.dto.NotificationResponceDTO;
import com.site.entity.NotificationEntity;
import com.site.service.NotificationService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path = "/safesite")
public class NotificationController {

	@Autowired
	private NotificationService service;

    @PostMapping("/insertNotification")
	public ResponseEntity<NotificationEntity> registerNotificationDetails(
			@RequestBody NotificationEntity notificationEntity) {
		log.info("In NotificationController...registerNotificationDetails() method register");
		try {

			log.info("In NotificationController...registerNotificationDetails() method started");

			NotificationEntity entity = service.saveOrUpdateDetails(notificationEntity);
			return new ResponseEntity<>(entity, HttpStatus.OK);

		} catch (Exception e) {
			log.error("In NotificationController...registerNotificationDetails() method error message accured");
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
    @GetMapping("/getNotifications")
    public NotificationResponceDTO getAllNotitfication()
    {
    	 NotificationResponceDTO dto=service.getAllNotification();
		return dto;
    	
    	
    }

}
