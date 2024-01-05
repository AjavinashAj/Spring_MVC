package com.dakr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dakr.entity.Registeration;
import com.dakr.repository.RegistrationRepository;

@SpringBootApplication
public class EmpRegistrationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(EmpRegistrationApplication.class, args);
		RegistrationRepository repo=context.getBean(RegistrationRepository.class);
		
//		Registeration r=new Registeration();
//		r.setFirstName("Amit");
//		r.setLastName("kumar");
//		r.setPhno((long)12345678);
//		r.setEmail("amit1213@gmail.com");
//		r.setPwd("avi113");
//		r.setConfPwd("avi1213");
//		repo.save(r);
//		System.out.println("successfully inserted...");
//	}
	}
}
