package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.User_Registration_Entity;
import in.ashokit.repository.User_Registration_Repository;

@SpringBootApplication
public class UserRegistrationApplication {

	public static void main(String[] args) {
		 ConfigurableApplicationContext context =SpringApplication.run(UserRegistrationApplication.class, args);
		 
		 User_Registration_Repository userRepo=context.getBean(User_Registration_Repository.class);
		 User_Registration_Entity ue=new User_Registration_Entity();
		 
		 ue.setFirstName("Avinash");
		 ue.setLastName("kumar");
		 ue.setPhno((long)1234567890);
		 ue.setEmail("avi123@gmail.com");
		 ue.setAddr("Delhi");
		 userRepo.save(ue);
	}

}
