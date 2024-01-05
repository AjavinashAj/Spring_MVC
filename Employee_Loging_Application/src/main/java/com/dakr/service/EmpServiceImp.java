package com.dakr.service;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dakr.binding.ForgetPasswordBinding;
import com.dakr.binding.logBinding;
import com.dakr.entity.Registeration;
import com.dakr.repository.RegistrationRepository;

@Service
public class EmpServiceImp implements EmpService{
	 
	Scanner s=new Scanner(System.in);
	
     @Autowired
	private RegistrationRepository repo;
     
     
	@Override
	public Object search(logBinding log) {
		String temp="";
		Optional<Registeration> op=repo.findByEmail(log.getEmail());
	    Optional<Registeration> op1 =repo.findByPhno(log.getPhno());
	    Optional<Registeration> op2 =repo.findByPwd(log.getPwd());
	    if(op.isPresent()|| op1.isPresent() && op2.isPresent())
	    {
	    	temp="Loging successfully";
	    }
	    else
	    {
	    	temp="Invalid data,Please Enter valid Data.....";
	    }
		return temp;
	}


	@Override
	public Object forgetPassword(ForgetPasswordBinding fgp) {
		String temp="";
		Optional<Registeration> op=repo.findByEmail(fgp.getEmail());
	    Optional<Registeration> op1 =repo.findByPhno(fgp.getPhno());
	    
	    
	    if(op.isPresent()|| op1.isPresent())
	    {
	    	Registeration r=new Registeration();
	    	r.setPwd(fgp.getPwd());
	    	r.setConfPwd(fgp.getConfPwd());
	    	repo.save(r);
	    	temp ="Password Updated Successfully....";
	    }
	    else
	    {
	    	temp="Invalid data,Please Enter valid Data.....";
	    }
		return temp;
	}

}
