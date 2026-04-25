package com.rays.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_allowlist")
public class AllowListDTO extends BaseDTO {

	@Column(name = "allow_code")
	private String allowCode;

	@Column(name = "username")
	private String username;

	@Column(name = "source")
	private String source;

	@Column(name = "status")
	private String status;

	public String getAllowCode() {
		return allowCode;
	}

	public void setAllowCode(String allowCode) {
		this.allowCode = allowCode;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String getUniqueKey() {
		return "allowCode";
	}

	@Override
	public String getUniqueValue() {
		return allowCode;
	}

	@Override
	public String getLabel() {
		return "Allow Code";
	}

	@Override
	public String getTableName() {
		return "Allow List";
	}

	@Override
	public String getValue() {
		return status;
	}

}
