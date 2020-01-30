package com.springSleuthExample.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties
@Entity
@Table(name = "user_entity", schema = "test")
public class UserEntity {
	@Id
	private String name;
	private String age;
	private String empId;
	private Long salary;

}