package com.hxd.struts.webziyuan;
//实现 ActionContext 来获取Web资源

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class WebAction {

	public String execute(){
		
		
		//从ActionContext中获取actionContext 
		ActionContext actionContext=ActionContext.getContext();
		
		//1.获取application 对象 对应的Map	并存值
		Map<String, Object>  applictionMap=actionContext.getApplication();
		applictionMap.put("applictionkey","applictionvalue");
		
		
		//2.获取session 对象对应的Map
		Map< String , Object> sessionMap=actionContext.getSession();
		sessionMap.put("sessionkey","sessionvalue");
		
		//3.获取request对象对应的Map 不过Actioncontext中 没有getrequest()方法 
		//但是  Actioncontext 本质就是一个Map 里面有个key 是 request 手动调用get
		Map<String , Object> requestMap=(Map<String, Object>) actionContext.get("requset");
		//requestMap.put("requestkey", "requestvalue");
		
		
		//4.获取请求参数对应的Map 并获取对应的参数值  paramMap.get()获取的是一个字符串数组
		Map<String, Object > paramMap=actionContext.getParameters();
			String parameter=((String[]) paramMap.get("name"))[0];
			System.out.println(parameter);
		
		return "success";
		
	}
	
	}
