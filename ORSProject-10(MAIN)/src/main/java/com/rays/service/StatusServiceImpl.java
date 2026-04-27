package com.rays.service;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.StatusDAOInt;
import com.rays.dto.StatusDTO;

@Service
public class StatusServiceImpl extends BaseServiceImpl<StatusDTO, StatusDAOInt> implements StatusServiceInt {

}
