package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Employee;
import in.ashokit.service.EmployeeService;

@Controller
public class EmpController {

	@Autowired
	private EmployeeService empService;

	@GetMapping("/")
	public String firstPage() {
		return "index";

	}
}
