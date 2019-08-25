package com.sbs.starter.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberDao {
	public int getLoginIdDupCount(String loginId);
}
