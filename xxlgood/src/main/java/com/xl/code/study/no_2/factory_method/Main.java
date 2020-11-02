package com.xl.code.study.no_2.factory_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext bf = new ClassPathXmlApplicationContext("spring-factory-method-test.xml");
		Object obj = bf.getBean("person");
		System.out.println(obj);
	}

}
