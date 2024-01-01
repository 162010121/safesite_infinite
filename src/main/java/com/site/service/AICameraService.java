package com.site.service;

import java.util.List;

import com.site.entity.AICameraEntity;

public interface AICameraService {
	
	
	public AICameraEntity saveOrUpdateDetails(AICameraEntity entity);
	
	public List<AICameraEntity> getAllCameraDetails();
	
	public AICameraEntity  getCamera(String Id);
	
	
	

}
