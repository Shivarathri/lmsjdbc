package com.capgemini.javafullstack.springcontroller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.javafullstack.bean.Engine;

public class TestCarEngine {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext contex = new ClassPathXmlApplicationContext("animal.xml");
		Engine e = contex.getBean(Engine.class);
		e.display();
		
	}
}
