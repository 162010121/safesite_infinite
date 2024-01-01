package com.site.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.site.entity.AICameraEntity;

@Repository
public interface AICameraRepository extends JpaRepository<AICameraEntity, String> {
	
	static final String QUERY_SELECT_DISTINCT_CAMERA_ZONE_FROM_AICAMERA_TABLE_ORDER_BY_ZONE_ASC_AICameraEntity = "select * from aicamera_table where camera_zone=:camera_zone";
	//static final String QUERY_TO_GET_CAMERAZONE = "select * from aicamera_table where camera_zone=:camera_zone ";

	


	@Query(value = QUERY_SELECT_DISTINCT_CAMERA_ZONE_FROM_AICAMERA_TABLE_ORDER_BY_ZONE_ASC_AICameraEntity, nativeQuery = true)
	List<AICameraEntity> getCameraZone(String camera_zone);
	
	

}
