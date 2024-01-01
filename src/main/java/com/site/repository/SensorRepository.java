package com.site.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.site.entity.SensorEntity;


@Repository
public interface SensorRepository extends CrudRepository<SensorEntity, String> {
	
	List<SensorEntity> findBySensorType(String sensorType);
	
	static final String QUERY_TO_GET_SENSOR = "select * from sensor_table";

	@Query(value = QUERY_TO_GET_SENSOR, nativeQuery = true)
	List<SensorEntity> getCameraZone(String sensor);

}
