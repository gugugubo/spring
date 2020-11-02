package com.xl.code.study.no_2.lookup_method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args){
		ApplicationContext bf = new ClassPathXmlApplicationContext("spring-lookup-method-test.xml");
		GetBeanTest test = (GetBeanTest) bf.getBean("getBeanTest");
		test.showMe();
	}
}
