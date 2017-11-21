package org.sxm.demo.service;

import java.util.List;

import org.sxm.demo.entity.UserInfo;

public interface UserInfoService {
	UserInfo load(Integer id);

	UserInfo get(Integer id);

	List<UserInfo> findAll();

	void persist(UserInfo entity);

	Integer save(UserInfo entity);

	void saveOrUpdate(UserInfo entity);

	void delete(Integer id);

	void flush();
}
