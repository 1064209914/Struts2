package com.hxd.struts.exception;

import com.opensymphony.xwork2.ActionSupport;

public class ExceptionOne extends ActionSupport {
	private static final long serialVersionUID = 1L;

	public String execute(){
		int a=10/0;
		return SUCCESS;
	}
	
}
