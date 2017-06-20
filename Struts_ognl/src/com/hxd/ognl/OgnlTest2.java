package com.hxd.ognl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.hxd.struts.ognlvaluestask.Teacher;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlTest2 {

	public static void main(String[] args) throws OgnlException {
		OgnlBean bean=new OgnlBean();
		OgnlContext context=new OgnlContext();
		context.put("bean",bean);
		
		System.out.println(Ognl.getValue("'Hello!'",context));
		System.out.println(Ognl.getValue("'A'",context));
		System.out.println(Ognl.getValue("88",context));
		System.out.println(Ognl.getValue("true",context));
		System.out.println(Ognl.getValue("null",context));
		
		
		System.out.println(Ognl.getValue("#name='zhangsan'",context));
		
		System.out.println(Ognl.getValue("bean.property",context));
		System.out.println(Ognl.getValue("bean.method()",context));
		
		System.out.println(Ognl.getValue("@com.hxd.ognl.OgnlBean@staticproperty",context));
		System.out.println(Ognl.getValue("@com.hxd.ognl.OgnlBean@staticmethod()",context));
		
		System.out.println(Ognl.getValue("(new java.lang.String(\"instance new  object!\")).toString()",context));
		
		System.out.println(Ognl.getValue("bean.getArray()[0]",context));
		System.out.println(Ognl.getValue("bean.array[0]",context));
		
		System.out.println(Ognl.getValue("bean.getList()[0]",context));
		System.out.println(Ognl.getValue("bean.list[0]",context));
		
		
		System.out.println(Ognl.getValue("bean.getMap()['home']",context));
		System.out.println(Ognl.getValue("bean.map['home']",context));
		System.out.println(Ognl.getValue("bean.getMap().office",context));
		System.out.println(Ognl.getValue("bean.map.office",context));
		
		
		int[] array=(int[]) Ognl.getValue("new int[]{0,1,2,3,4,5}", context);
				System.out.println(Arrays.toString(array));
		
		List  list=(List) Ognl.getValue("{0,1,2,3,4,5}", context);
		System.out.println(list);
		
		Map map=(Map) Ognl.getValue("#{'key1':'value1','key2':'value2','key3':'value3'}", context);
		System.out.println(map);
		
		List<Teacher> teacherlist=new ArrayList<Teacher>();
		teacherlist.add(new Teacher("Jack1", 2000));
		teacherlist.add(new Teacher("Jack2", 3000));
		teacherlist.add(new Teacher("Jack3", 4000));
		teacherlist.add(new Teacher("Jack4", 5000));
		teacherlist.add(new Teacher("Jack5", 6000));
		teacherlist.add(new Teacher("Jack6", 7000));
		context.put("teacherlist", teacherlist);
		
		System.out.println(Ognl.getValue("teacherlist.{name}",context));
		System.out.println(Ognl.getValue("teacherlist.{#this.name.toUpperCase()}",context));
		System.out.println(Ognl.getValue("teacherlist.{#this.salary>2500?#this.salary:#this.salary+99}",context));
		System.out.println(Ognl.getValue("teacherlist.{?#this.salary>2500}[0]",context));
		System.out.println(Ognl.getValue("teacherlist.{?#this.salary>2500}",context));
		System.out.println(Ognl.getValue("teacherlist.{^#this.salary>2500}",context));
		System.out.println(Ognl.getValue("teacherlist.{$#this.salary>2500}",context));
		
	}

}
