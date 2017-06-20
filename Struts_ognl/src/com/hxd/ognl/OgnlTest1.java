package com.hxd.ognl;

import com.hxd.struts.ognlvaluestask.Student;
import com.hxd.struts.ognlvaluestask.Teacher;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlTest1 {

	public static void main(String[] args) throws OgnlException {
		Student student =new Student("Jack", 20);
		Teacher teacher=new Teacher("Tom", 5500);
		
		OgnlContext ognlContext=new OgnlContext();
		ognlContext.put("student", student);
		ognlContext.put("teacher", teacher);

		System.out.println(Ognl.getValue("name",ognlContext,student));
		System.out.println(Ognl.getValue("name",ognlContext,teacher));
		
		System.out.println(Ognl.getValue("student.name",ognlContext));
		System.out.println(Ognl.getValue("student.score",ognlContext));
		
		System.out.println(Ognl.getValue("teacher.name",ognlContext));
		System.out.println(Ognl.getValue("teacher.salary",ognlContext));
		
	}

}
