package in.ashokit.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.User_Registration_binding;
import in.ashokit.entity.User_Registration_Entity;
import in.ashokit.repository.User_Registration_Repository;

@RestController
public class User_Controller {
    
	@Autowired
	private User_Registration_Repository userRepo;

	@GetMapping("/")
	public String loadForm() {
		return "index";
	}

	@PostMapping("/save")
	public String handelRegistration(User_Registration_binding userbind) {
       //for copy data binding class object to entity class object
		//create entity class object
		User_Registration_Entity entity=new User_Registration_Entity();
		BeanUtils.copyProperties(userbind, entity);
		//save entity entity class object into repository for data base operation
		userRepo.save(entity);
		
		return"Registration completed successfully....";
	}
}
