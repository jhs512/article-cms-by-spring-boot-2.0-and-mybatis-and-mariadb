package com.sbs.starter.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {
	public int getLoginIdDupCount(String loginId);

	public void join(Map<String, Object> param);
}
