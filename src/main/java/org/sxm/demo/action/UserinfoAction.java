package org.sxm.demo.action;

import java.util.List;

import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;
import org.sxm.demo.entity.UserInfo;
import org.sxm.demo.service.UserInfoService;
import org.sxm.demo.utils.AjaxUtil;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

@Results({
	@Result(name="success",location="/content/userinfo.jsp",type="dispatcher")
})

@Namespace(value="/")
public class UserinfoAction extends ActionSupport implements ModelDriven<UserInfo>,
		Preparable {

	private static final long serialVersionUID = -2301203156032690317L;

	private static final Logger LOGGER = Logger.getLogger(UserinfoAction.class);
	private Integer id;
	private UserInfo userInfo;
	private List<UserInfo> userInfos;

	@Autowired
	private UserInfoService userInfoService;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}
//3333333333333333335555555555555555555550000000000000
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public List<UserInfo> getUserInfos() {
		return userInfos;
	}
//22222222222222222222222
	public void setUserInfos(List<UserInfo> userInfos) {
		this.userInfos = userInfos;
	}


	@Override
	public UserInfo getModel() {
		//这是我的dev分支
		if (null != id) {
			userInfo = userInfoService.get(id);
			//111111111111111111111
		} else {
			userInfo = new UserInfo();
		}
		return userInfo;
	}

	@Override
	public String execute() throws Exception {
		LOGGER.info("查询所有用户");
		userInfos = userInfoService.findAll();
		return SUCCESS;
		
	}

	public void detail() {
		String id = ServletActionContext.getRequest().getParameter("id");
		LOGGER.info("查看用户详情：" + id);
		userInfo = userInfoService.get(Integer.valueOf(id));
		AjaxUtil.ajaxJSONResponse(userInfo);
	}

	@Override
	public void prepare() throws Exception {
		
	}

}
