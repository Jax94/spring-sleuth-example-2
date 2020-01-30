package com.springSleuthExample.service;

import com.springSleuthExample.model.User;
public interface UserService {
	
	User addUser(User user);

	User getUser(String id);

}
