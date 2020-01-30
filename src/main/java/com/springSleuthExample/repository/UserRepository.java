package com.springSleuthExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springSleuthExample.domain.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {

	UserEntity findByEmpId(String id);


}
