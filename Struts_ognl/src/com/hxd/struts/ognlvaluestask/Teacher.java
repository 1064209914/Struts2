package com.hxd.struts.ognlvaluestask;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Teacher {
	private String name;
	private float salary;
	public Teacher(String name, float salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
