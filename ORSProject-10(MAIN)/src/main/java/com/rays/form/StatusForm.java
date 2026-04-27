package com.rays.form;

import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.StatusDTO;

public class StatusForm extends BaseForm{

	@NotEmpty(message = "status is required")
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@Override
	public BaseDTO getDto() {
		StatusDTO dto = initDTO(new StatusDTO());
		return dto;
	}
}
