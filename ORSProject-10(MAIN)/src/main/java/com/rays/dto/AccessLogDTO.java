package com.rays.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_accesslog")
public class AccessLogDTO extends BaseDTO {

	@Column(name = "accesslog_code")
	private String accesslogCode;

	@Column(name = "username")
	private String username;

	@Column(name = "access_time")
	private LocalDateTime accessTime;

	@Column(name = "status")
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
	public String getUniqueKey() {
		return "accesslogCode";
	}

	@Override
	public String getUniqueValue() {
		return accesslogCode;
	}

	@Override
	public String getLabel() {
		return "Access Log Code";
	}

	@Override
	public String getTableName() {
		return "Access Log";
	}
	
	@Override
	public String getKey() {
		return username;
	}
	
	@Override
	public String getValue() {
		return username;
	}

}
