package com.xl.code.study.no_2.factory_method;


public class PersonFactory {

	/**
	 * 静态工厂方法
	 */
	public static Person staticBuildPerson(){
		Person person = new Person();
		person.setName("小刘");
		person.setSex(false);
		person.setAge(18);
		return person;
	}

	/**
	 * 实例工厂方法
	 */
	public Person buildPerson() {
		Person person = new Person();
		person.setName("小刘");
		person.setSex(false);
		person.setAge(18);
		return person;
	}
}
