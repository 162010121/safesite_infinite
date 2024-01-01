package com.site.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.site.entity.AICameraEntity;
import com.site.repository.AICameraRepository;
import com.site.service.AICameraService;

@Service
public class AICameraServiceImpl implements AICameraService {

	@Autowired
	private AICameraRepository repository;

	
	
	
	@Override
	public AICameraEntity saveOrUpdateDetails(AICameraEntity entity) {
		return repository.save(entity);
	}

	@Override
	public List<AICameraEntity> getAllCameraDetails() {
		return repository.findAll();
	}

	@Override
	public AICameraEntity getCamera(String Id) {
		return repository.findById(Id).get();
	}

	

}
