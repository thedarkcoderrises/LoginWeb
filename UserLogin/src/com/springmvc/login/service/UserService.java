package com.springmvc.login.service;

import com.springmvc.login.from.LoginForm;
import com.springmvc.login.from.User;

public interface UserService {

	public User validateUser (LoginForm login);
	
	public void register(User user);
}
