package com.hxd.struts.action;

import com.hxd.struts.bean.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<User>{
	
	private User user=new User();	
	@Override
	public User getModel() {
		//获取值栈
		//创建对象
		//压入值栈
		return user;
	}
	
	public String login(){
		System.out.println(user.getUsername());
		System.out.println(user.getPassword());
		System.out.println(user.getBooklist());
		return SUCCESS;
	}
}
