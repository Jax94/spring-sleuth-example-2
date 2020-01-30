package com.springSleuthExample.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springSleuthExample.domain.UserEntity;
import com.springSleuthExample.model.User;
import com.springSleuthExample.repository.UserRepository;
import com.springSleuthExample.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository repo;

	@Override
	public User addUser(User user) {
		UserEntity entity = new UserEntity();
		BeanUtils.copyProperties(user, entity);
		repo.save(entity);
		return user;
	}

	@Override
	public User getUser(String id) {
		UserEntity entity = repo.findByEmpId(id);
		User user = new User();
		BeanUtils.copyProperties(entity, user);
		return user;
	}

}
