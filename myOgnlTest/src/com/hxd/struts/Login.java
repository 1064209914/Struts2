package com.hxd.struts;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class Login extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute(){
		System.out.println(user.getName());
	/*	//1.获得值栈
		ValueStack valueStack=ActionContext.getContext().getValueStack();
		//2.创建对象实例
		user=new User("zhangsan", "15");
		//3.将对象压入栈顶
		valueStack.push(user);
		System.out.println(user);*/
		return SUCCESS;
	}
}
