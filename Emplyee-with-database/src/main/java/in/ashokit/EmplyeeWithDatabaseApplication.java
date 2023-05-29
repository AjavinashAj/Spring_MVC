package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.binding.Employee;
import in.ashokit.repository.EmpRepository;

@SpringBootApplication
public class EmplyeeWithDatabaseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(EmplyeeWithDatabaseApplication.class, args);
		
		EmpRepository emp=context.getBean(EmpRepository.class);
		Employee e=new Employee();
//		e.setId(123);
//		e.setName("Avinash");
//		e.setSal((double)9000);
//		e.setDesig("java developer");
		emp.save(e);
	}

}
