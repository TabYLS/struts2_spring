package com.ecjtu.ss.dao.impl;

import org.springframework.stereotype.Repository;

import com.ecjtu.ss.dao.IUserDao;
import com.ecjtu.ss.pojo.User;

/**
* @author 叶林生 
* @date：2017年7月12日 上午8:50:10
* @version 1.0
* 
*/
@Repository("userDao")
public class UserDao implements IUserDao {
	
	public UserDao(){}

	@Override
	public void login(User user) {
		System.out.println(user + "用户登陆。。。。。。。");
	}

}
