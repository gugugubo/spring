package com.xl.code.study.no_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-test.xml");

		UserService userService = (UserService) context.getBean("userService");

		User user = userService.getUserById(1);

		System.out.println(user);

	}
}
