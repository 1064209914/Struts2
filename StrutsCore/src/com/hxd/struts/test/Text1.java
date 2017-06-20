package com.hxd.struts.test;

import com.opensymphony.xwork2.ActionSupport;

public class Text1 extends ActionSupport {

	
	public String execute(){
		addActionMessage("nihao");
		return "success";
	}

}
