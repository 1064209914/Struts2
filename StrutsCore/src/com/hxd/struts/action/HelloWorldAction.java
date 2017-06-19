package com.hxd.struts.action;


public class HelloWorldAction {

		public String add(){
			return  "success";
		}
	
		public String sub(){
			return "success";
		}
		
	
	public String execute() throws Exception {
		System.out.println("方法执行了。。。");
		return "success";
	}

}
