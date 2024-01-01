package com.site.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.entity.SensorEntity;
import com.site.repository.SensorRepository;
import com.site.service.SensorService;

@Service
public class SensorServiceImpl implements SensorService {

	@Autowired
	private SensorRepository repository;
	@Override
	public SensorEntity saveOrUpdate(SensorEntity entity) {
		
		return repository.save(entity);
	
	}
	@Override
	public SensorEntity getById(String sensorId) {
		// TODO Auto-generated method stub
		return repository.findById(sensorId).get();
	}
	@Override
	public SensorEntity getSensorType(String sensorType) {
		return (SensorEntity) repository.findBySensorType(sensorType);
	}
	
	
	
	
	
	
	
	
		
		
	}
