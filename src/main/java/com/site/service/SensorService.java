package com.site.service;

import com.site.entity.SensorEntity;

public interface SensorService {
	
	
	public SensorEntity saveOrUpdate(SensorEntity entity);
	
    public SensorEntity getById(String sensorId);
	
	public SensorEntity getSensorType(String sensorType);

	
	

}
