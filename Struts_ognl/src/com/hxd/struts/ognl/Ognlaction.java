package com.hxd.struts.ognl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hxd.struts.ognlvaluestask.Student;
import com.hxd.struts.ognlvaluestask.Teacher;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import lombok.Getter;
import lombok.Setter;
import ognl.OgnlException;

@Setter @Getter
public class Ognlaction extends ActionSupport {
		private static final long serialVersionUID=1L;
		
		private String greeting;
		
		private List<Person> persons=new ArrayList<Person>();
		
		public void initData(){
			Address address1=new Address("中国", "合肥", "滨湖区11号");
			Address address2=new Address("中国", "北京", "钓鱼岛");
			Address address3=new Address("中国", "上海", "东方明珠上");
			
			String[] aliases1={"xiaozhang","三儿"};
			String[] aliases2={"laoli","四儿"};
			String[] aliases3={"laowu","五儿"};
			
			List<String> email1=new ArrayList<String>();
			email1.add("1111@qq.com");
			email1.add("2222@qq.com");
			List<String> email2=new ArrayList<String>();
			email2.add("3333@qq.com");
			email2.add("4444@qq.com");
			List<String> email3=new ArrayList<String>();
			email3.add("5555@qq.com");
			email3.add("6666@qq.com");
			
			Map<String, String > phone1=new HashMap<String,String>();
			phone1.put("home", "1111111");
			phone1.put("office", "2222222");
			Map<String, String > phone2=new HashMap<String,String>();
			phone2.put("home", "3333333");
			phone2.put("office", "4444444");
			Map<String, String > phone3=new HashMap<String,String>();
			phone3.put("home", "5555555");
			phone3.put("office", "6666666");
			
			Person person1=new Person("张三", 33, 3333, address1, aliases1, email1, phone1);
			Person person2=new Person("李四", 44, 4444, address2, aliases2, email2, phone2);
			Person person3=new Person("王五", 55, 5555, address3, aliases3, email3, phone3);
			
			persons.add(person1);
			persons.add(person2);
			persons.add(person3);
		}

		@SuppressWarnings({"unchecked","rawtypes"})
		@Override
		public String execute() throws Exception {
				initData();
				valueStack();
				ActionContext actionContext=ActionContext.getContext();
				//Map request=actionContext.getContextMap();
				Map request =(Map) actionContext.get("request");
				Map session=actionContext.getSession();
				Map applictoin=actionContext.getApplication();
				
				request.put("personName",persons.get(0).getName());
				session.put("personName",persons.get(1).getName());
				applictoin.put("personName",persons.get(2).getName());
			return SUCCESS;
		}
		
		public  void  valueStack() throws OgnlException {
			 Student stu=new Student("Jack", 20);
			 Teacher teacher=new Teacher("Tom", 5500);
			 
			 ValueStack valueStack=ActionContext.getContext().getValueStack();
			 valueStack.push(stu);
			 System.out.println(valueStack.findValue("name"));
			 valueStack.push(teacher);
			 System.out.println(valueStack.findValue("name"));
			 System.out.println("=================================");
			 System.out.println(valueStack.findValue("score"));
			 System.out.println(valueStack.findValue("salary"));
			 
			 System.out.println("=================================");
			 valueStack.setValue("name","Rose");
			 System.out.println(valueStack.findValue("name"));
			 valueStack.setValue("score","80");
			 System.out.println(valueStack.findValue("score"));
			 System.out.println("=================================");
		}
		
}
