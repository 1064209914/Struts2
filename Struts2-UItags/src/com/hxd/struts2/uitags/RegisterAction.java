package com.hxd.struts2.uitags;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	 private String userName;
	 private String	password;
	 private String gender;
	 private String about;
	 private String country;
	 private List<Country> countrylist;
	 private String[] community;
	 private List<String> communitylist;
	 private Boolean mailinglist;
	 
	 public  String populate(){
		 //向页面上的国家字段列表添加选项值
		 countrylist=new ArrayList<Country>();
		 countrylist.add(new Country(1, "india"));
		 countrylist.add(new Country(2, "USA"));
		 countrylist.add(new Country(3, "France"));
		 countrylist.add(new Country(4, "China"));
		 
		 //向页面上 社区字段复选框添加选项框
		 communitylist =new ArrayList<>();
		 communitylist.add("java");
		 communitylist.add("php");
		 communitylist.add("ASP");
		 communitylist.add(".Net");
		 
		 community= new String[]{"java",".Net"};
		 mailinglist=true;
		 
		 return "populate";
	 }
	 
	 public String execute(){
		 return SUCCESS;
	 }
}
