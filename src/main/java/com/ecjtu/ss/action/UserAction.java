package com.ecjtu.ss.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.ecjtu.ss.pojo.User;
import com.ecjtu.ss.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

/**
* @author 叶林生 
* @date：2017年7月12日 上午8:39:19
* @version 1.0
* 
*/
@Controller("userAction")
public class UserAction extends ActionSupport {
	
	private IUserService userService;
	
	public UserAction(){
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String login(){
		userService.login(new User("张三", "123465"));
		System.out.println("登陆啦。。。。。。。");
		return "login";
	}

	public IUserService getUserService() {
		return userService;
	}

	@Resource(name="userService")
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}

}
