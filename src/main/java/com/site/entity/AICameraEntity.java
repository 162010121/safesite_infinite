package com.site.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name="AICamera_Table")
public class AICameraEntity {

	
	@Id
	@Column(name="camera_id")
	private String cameraId;

	@Column(name="camera_name")
	@JsonIgnoreProperties
	private String cameraName;
	
	@Column(name="camera_zone")
	private String cameraZone;

	@Column(name="camera_location")
	private String cameraLocation;

	@Column(name="motion")
	private Long motion;

	@Column(name="connectivity_strength")
	private Long connectivityStrength;
}
