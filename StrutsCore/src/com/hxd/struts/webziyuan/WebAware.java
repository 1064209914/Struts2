package com.hxd.struts.webziyuan;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class WebAware implements ApplicationAware,SessionAware,RequestAware,ParameterAware {

			private  Map<String, Object> applicationMap;
			private Map<String, Object> sessionMap;
			private Map<String, Object> requestMap;
			private Map<String, String[]> parameterMap;
			
	
	@Override
	public void setParameters(Map<String, String[]> arg0) {
		this.parameterMap=arg0;
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.requestMap=arg0;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.sessionMap=arg0;
	}

	@Override
	public void setApplication(Map<String, Object> arg0) {
		this.applicationMap=arg0;
	}
	public String execute(){
		System.out.println(applicationMap.get("date"));
		System.out.println(parameterMap.get("name")[0]);
		applicationMap.put("applictionkey","applictionvalue");
		sessionMap.put("sessionkey","sessionvalue");
		requestMap.put("requestkey", "requestvalue");
		return "success";
	}
}
