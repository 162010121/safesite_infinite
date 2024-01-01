package com.site.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.site.entity.NotificationEntity;

@Repository
public interface NotificationRepository extends JpaRepository<NotificationEntity, String> {

	static final String QUERY_TO_GET_NOTIFICATIONTYPE = "select * from notification_table where notification_Type=:notificationType ";

	@Query(value = QUERY_TO_GET_NOTIFICATIONTYPE, nativeQuery = true)
	List<NotificationEntity> notificationType(String notificationType);

}
