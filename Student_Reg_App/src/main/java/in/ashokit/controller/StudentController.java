package in.ashokit.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.Student;
import in.ashokit.entity.StudentEntity;
import in.ashokit.repository.StudentRepository;

@Controller
public class StudentController {
	@Autowired
	private StudentRepository repo;
	
	//method to load student form
	@GetMapping("/")
	public String loadForm(Model model)
	{
		//where ever duplicate data required it will send
		loadFormData(model);
		
		return "index";
	}
	private void loadFormData(Model model) {
		List<String> coursesList=new ArrayList<>();
		coursesList.add("java");
		coursesList.add("DevOps");
		coursesList.add("AWS");
		coursesList.add("python");
		
		List<String> timingsList=new ArrayList<>();
		timingsList.add("Morning");
		timingsList.add("AfterNoon");
		timingsList.add("Evening");
		
		Student student=new Student();
		model.addAttribute("student",student);
		model.addAttribute("courses",coursesList);
		model.addAttribute("timings",timingsList);
	}
	@PostMapping("/save")
	public String handleSubmit(Student s,Model model)
	{
		//logic to save
		StudentEntity entity=new StudentEntity();
		
		//copy data from binding obj to enity object ,bec UI se data binding object ke form mai aata hai
		BeanUtils.copyProperties(s, entity);
		//datatype of timing of binding class and entity class are different so we converting aaray to string and saving to entity class object
		entity.setTimings(Arrays.toString(s.getTimings()));
		repo.save(entity);
		System.out.println(s);
		model.addAttribute("msg","Student Details Added successfully....");
		loadFormData(model);
		return "index";
	}
	
	@GetMapping("/viewStudents")
	public String getStudentsData(Model model)
	{
		//logic to fetch and send students data
		List<StudentEntity> studentsList=repo.findAll();
		model.addAttribute("students",studentsList);
		return "Data";
	}

}
