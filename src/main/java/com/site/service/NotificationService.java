package com.site.service;

import com.site.dto.NotificationResponceDTO;
import com.site.entity.NotificationEntity;

public interface NotificationService {
	
	
	
	public NotificationEntity saveOrUpdateDetails(NotificationEntity notificationEntity);
	
	public NotificationResponceDTO getAllNotification();
	
	
}
