package com.capgemini.javafullstack.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.javafullstack.bean.HelloSetter;

public class TestHelloSetters {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HelloSetter info = context.getBean(HelloSetter.class);
		info.print();
		/*
		 * HelloSetter info1 = context.getBean(HelloSetter.class); info1.print();
		 * 
		 * System.out.println(info==info1);
		 */
		context.close();
	}
}
