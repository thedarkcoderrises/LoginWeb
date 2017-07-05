package com.springmvc.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.login.dao.UserDao;
import com.springmvc.login.from.LoginForm;
import com.springmvc.login.from.User;
import com.springmvc.login.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	

	public User validateUser(LoginForm login) {
		return userDao.validateUser(login);
	}

	public void register(User user) {
		userDao.register(user);
	}
}


