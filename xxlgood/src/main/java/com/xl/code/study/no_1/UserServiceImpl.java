package com.xl.code.study.no_1;


public class UserServiceImpl implements UserService {
	@Override
	public User getUserById(int id) {
		User user = new User();
		user.setAge(17);
		user.setName("小小刘");
		return user;
	}
}
