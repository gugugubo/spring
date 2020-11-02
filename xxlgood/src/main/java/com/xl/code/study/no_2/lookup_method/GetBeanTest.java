package com.xl.code.study.no_2.lookup_method;


public abstract class GetBeanTest {
	public void showMe() {
		this.getBean().showMe();
	}

	public abstract User getBean();
}
