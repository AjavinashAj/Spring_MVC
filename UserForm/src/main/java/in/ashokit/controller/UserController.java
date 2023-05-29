package in.ashokit.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.ashokit.binding.User;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String loadForm()
	{
		return "index";
	}
	
	@PostMapping("/aj")
	public String handleSubmitbut(User user,Model model)
	{
		System.out.println(user);
		model.addAttribute("msg",user+"User Saved Successfully.....");
		return "index";
	}

}
