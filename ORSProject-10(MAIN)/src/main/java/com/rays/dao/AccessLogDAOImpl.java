package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.AccessLogDTO;

@Repository
public class AccessLogDAOImpl extends BaseDAOImpl<AccessLogDTO> implements AccessLogDAOInt {

	@Override
	public Class<AccessLogDTO> getDTOClass() {
		return AccessLogDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(AccessLogDTO dto, CriteriaBuilder builder, Root<AccessLogDTO> qRoot) {

		List<Predicate> whereCondition = new ArrayList<Predicate>();

		if (!isEmptyString(dto.getAccesslogCode())) {

			whereCondition.add(builder.like(qRoot.get("accesslogCode"), dto.getAccesslogCode() + "%"));
		}

		if (!isEmptyString(dto.getUsername())) {

			whereCondition.add(builder.like(qRoot.get("username"), dto.getUsername() + "%"));
		}

		if (isNotNull(dto.getAccessTime())) {

			whereCondition.add(builder.equal(qRoot.get("accessTime"), dto.getAccessTime()));
		}

		if (!isEmptyString(dto.getStatus())) {

			whereCondition.add(builder.like(qRoot.get("status"), dto.getStatus() + "%"));
		}
		return whereCondition;
	}

}
