package com.hxd.struts.ognl;

import java.util.List;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Person {
	private String name;
	private int age;
	 private float salary;	//薪水
	 
	 private Address address;
	 private String[] aliases;
	 private List<String> email;
	 private Map<String, String> phones;
	 
	public Person() {
		super();
	}

	public Person(String name, int age, float salary, Address address, String[] aliases, List<String> email,
			Map<String, String> phones) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
		this.aliases = aliases;
		this.email = email;
		this.phones = phones;
	}
	 
}
