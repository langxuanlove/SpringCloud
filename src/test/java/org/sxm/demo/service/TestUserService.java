package org.sxm.demo.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.alibaba.fastjson.JSON;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.sxm.demo.entity.UserInfo;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
		"classpath:spring-hibernate.xml" })
public class TestUserService {
	private static final Logger LOGGER = Logger
			.getLogger(TestUserService.class);

	@Autowired
	private UserInfoService userInfoService;

	@Test
	public void save() {
		UserInfo userInfo = new UserInfo();
		userInfo.setName("zty");
		userInfo.setAge(23);
		userInfo.setTelephone("13212221333");
		Integer id = userInfoService.save(userInfo);
		JSON.toJSONString(id);
	}

}
