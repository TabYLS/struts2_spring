package com.ecjtu.ss.pojo;
/**
* @author 叶林生 
* @date：2017年7月12日 上午8:53:00
* @version 1.0
* 
*/
public class User {
	
	public User(){}
	
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}
	
}
