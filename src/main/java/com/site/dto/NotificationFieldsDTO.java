package com.site.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class NotificationFieldsDTO {

	private String notificationId;

	private String notificationType;

	private String notificationZone;

	private String location;

	private String reason;

	private Date dateAndTime;

	private Long sensorId;

	private String sensorName;

	private Long cameraId;

	private String cameraName;

	private Double temperature;

	private Double humidity;

	private Double carbonMonaxide;

	private Double voc;

	private Double particulate;

	private Double noise;

	private Long motion;

	private Double light;

	private Double pressure;

	private Double waterLevel;

	private Double rainfall;

	private Long battery;

	private Long connectvityStrength;

}
