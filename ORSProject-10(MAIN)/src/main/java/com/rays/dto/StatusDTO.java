package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;
@Entity
@Table(name = "st_status")
public class StatusDTO extends BaseDTO {
	@Column(name = "status")
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getUniqueKey() {
		return "status";
	}

	@Override
	public String getUniqueValue() {
		return status;
	}

	@Override
	public String getLabel() {
		return "status";
	}

	@Override
	public String getTableName() {
		return "status";
	}
	
	@Override
	public String getValue() {
		return status;
	}

	@Override
	public String getKey() {
		return status;
	}
}
