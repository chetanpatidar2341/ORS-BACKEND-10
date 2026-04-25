package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.AccessLogDTO;
import com.rays.form.AccessLogForm;
import com.rays.service.AccessLogServiceInt;

@RestController
@RequestMapping(value = "Accesslog")
public class AccessLogCtl extends BaseCtl<AccessLogForm, AccessLogDTO, AccessLogServiceInt> {

	@Autowired
	private AccessLogServiceInt accessLogService;

	@GetMapping("preload")
	public ORSResponse preload() {
		ORSResponse resp = new ORSResponse(true);
		List<DropdownList> accessLogList = accessLogService.search(new AccessLogDTO(), userContext);
		resp.addResult("accessLogList", accessLogList);

		return resp;
	}

}
