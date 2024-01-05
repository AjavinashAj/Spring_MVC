package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Employee;

@Controller
public class EmpController {
	
	
	
	@GetMapping("/")
	public String getInf()
	{
		return "index";
	}
	@PostMapping("/emp")
	public String show(Employee emp,Model model)
	{
		System.out.println(emp);
		model.addAttribute("msg", "Employee Added Successfully....");
		return "index";
		
	}

}

