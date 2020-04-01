package com.capgemini.javafullstack.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.javafullstack.bean.Car;

public class TestCar {
	

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Car c= context.getBean(Car.class);
		c.display();
	}

}
