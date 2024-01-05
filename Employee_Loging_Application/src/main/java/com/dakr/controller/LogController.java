package com.dakr.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dakr.binding.ForgetPasswordBinding;
import com.dakr.binding.RegistrationBinding;
import com.dakr.binding.logBinding;
import com.dakr.entity.Registeration;
import com.dakr.repository.RegistrationRepository;
import com.dakr.service.EmpService;

@RestController
public class LogController {

	@Autowired
	private RegistrationRepository repo;
	
	@Autowired
	private EmpService empser;

	@PostMapping("/save")
	public String loadRegistration(RegistrationBinding bind) {
		// for copy data binding class object to entity class object
		// create entity class object
		Registeration r = new Registeration();
		BeanUtils.copyProperties(bind, r);
		// save entity entity class object into repository for data base operation
		repo.save(r);
		return "Registration completed successfully...";

	}
    
	@PostMapping("/log")
	public Object handleLog(@ModelAttribute("log") logBinding log) {
		
		return empser.search(log);

	}
	
	
	@PostMapping("/forget")
	public Object handleForgetPwd(@ModelAttribute("fgp")ForgetPasswordBinding fgp)
	{
		return empser.forgetPassword(fgp);
	}

}
