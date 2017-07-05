package com.springmvc.login.dao;

import com.springmvc.login.from.LoginForm;
import com.springmvc.login.from.User;

public interface UserDao {
	  void register(User user);
	  User validateUser(LoginForm login);
	}
