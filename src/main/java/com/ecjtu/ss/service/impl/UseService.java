package com.ecjtu.ss.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ecjtu.ss.dao.IUserDao;
import com.ecjtu.ss.pojo.User;
import com.ecjtu.ss.service.IUserService;

/**
* @author 叶林生 
* @date：2017年7月12日 上午9:05:40
* @version 1.0
* 
*/
@Service("userService")
public class UseService implements IUserService {
	
	public UseService(){}
	
	private IUserDao userdao;

	@Override
	public void login(User user) {
		userdao.login(user);
	}

	public IUserDao getUserdao() {
		return userdao;
	}

	@Resource(name="userDao")
	public void setUserdao(IUserDao userdao) {
		this.userdao = userdao;
	}
	
}
