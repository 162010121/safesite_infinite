package com.site.dto;

import lombok.Data;

@Data
public class LogoutDTO {
	
	private String token;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

}
