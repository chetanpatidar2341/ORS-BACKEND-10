package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.StatusDTO;
import com.rays.form.StatusForm;
import com.rays.service.StatusServiceInt;
@RestController
@RequestMapping(value = "Status")
public class StatusCtl extends BaseCtl<StatusForm, StatusDTO, StatusServiceInt> {

}
