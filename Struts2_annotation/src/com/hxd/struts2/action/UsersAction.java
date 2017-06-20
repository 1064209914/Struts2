package com.hxd.struts2.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class UsersAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	
	/**
	 * value值表示path form中action的值对应
	 * name表示逻辑视图名
	 * location表示物理视图名
	 */
	
	@Action(value="/users",results={@Result(name="success",location="/success.jsp")  } )
	public String execute(){
		return SUCCESS;
	}
}
