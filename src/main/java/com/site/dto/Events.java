package com.site.dto;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
public class Events {
	
	
	private Integer eventCount;
	private List<NotificationFieldsDTO> eventsList;

}
