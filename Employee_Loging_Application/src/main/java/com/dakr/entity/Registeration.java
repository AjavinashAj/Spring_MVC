package com.dakr.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="REGISTRATION_TBL")
public class Registeration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="EmpFirstName")
	private String firstName;
	private String lastName;
	private Long phno;
	private String email;
	private String pwd;
	private String confPwd;
	
	

}
