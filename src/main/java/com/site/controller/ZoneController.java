package com.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.site.dto.ZonesDTO;
import com.site.service.ZoneService;

@RestController
@RequestMapping("/safesite")
public class ZoneController {
	
	@Autowired
	private ZoneService service;
	
	/*
	 * @GetMapping("/getAllZoneDetails") public ZoneResponceDTO getAllZone() {
	 * 
	 * ZoneResponceDTO resDTO=service.getAllZone(); return resDTO;
	 * 
	 * 
	 * }
	 */
	
	@GetMapping("/getAllZones")
	public ZonesDTO getAllZones()
	{
		
		
		return service.getAICameraDetails();
		
		
	}
	

}
