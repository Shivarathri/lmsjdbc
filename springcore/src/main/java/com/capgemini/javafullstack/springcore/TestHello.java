package com.capgemini.javafullstack.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.javafullstack.bean.EmployeePrimaryInfo;
import com.capgemini.javafullstack.bean.Hello;

public class TestHello {
	public static void main(String[] args) {
		/*
		 * Hello hello = new Hello(); hello.print();
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		/*
		 * Hello h = context.getBean(Hello.class); h.print();
		 */
		EmployeePrimaryInfo info = context.getBean(EmployeePrimaryInfo.class);
		info.print();
		/*
		 * Hello info = context.getBean(Hello.class); info.print();
		 */
		/*
		 * info.print(); info.getAddress().address();
		 */
		EmployeePrimaryInfo info2 = context.getBean(EmployeePrimaryInfo.class);
		info2.print();
		System.out.println(info==info2);
		
		
	}
}
