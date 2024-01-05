package com.dakr.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dakr.entity.Registeration;

public interface RegistrationRepository extends JpaRepository<Registeration, Integer>{
	
	public Optional<Registeration> findByPhno(Long phno);
	
	public Optional<Registeration>findByEmail(String email);
	
	public Optional<Registeration>  findByPwd(String pwd);
	
	public Optional<Registeration>findByConfPwd(String confPwd);

}
