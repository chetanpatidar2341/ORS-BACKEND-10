package com.rays.form;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.AccessLogDTO;

public class AccessLogForm extends BaseForm {

	@NotEmpty(message = "Accesslog Code is required")
	private String accesslogCode;

	@NotEmpty(message = "Username is required")
	private String username;

	@NotNull(message = "Access Time is required")
	private LocalDateTime accessTime;

	@NotEmpty(message = "Status is required")
	private String status;

	public String getAccesslogCode() {
		return accesslogCode;
	}

	public void setAccesslogCode(String accesslogCode) {
		this.accesslogCode = accesslogCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDateTime getAccessTime() {
		return accessTime;
	}

	public void setAccessTime(LocalDateTime accessTime) {
		this.accessTime = accessTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public BaseDTO getDto() {
		AccessLogDTO dto = initDTO(new AccessLogDTO());

		dto.setAccesslogCode(accesslogCode);
		dto.setUsername(username);
		dto.setAccessTime(accessTime);
		dto.setStatus(status);
		return dto;

	}

}
