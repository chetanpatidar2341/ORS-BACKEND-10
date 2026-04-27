package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.StatusDTO;
@Repository
public class StatusDAOImpl extends BaseDAOImpl<StatusDTO> implements StatusDAOInt {

	@Override
	public Class<StatusDTO> getDTOClass() {
		return StatusDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(StatusDTO dto, CriteriaBuilder builder, Root<StatusDTO> qRoot) {
		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		return whereCondition;
	}

}
