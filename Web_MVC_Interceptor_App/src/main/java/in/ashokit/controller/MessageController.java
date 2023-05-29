package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MessageController {
	@GetMapping("/welcome")
	@ResponseBody
	public String welcomeMsg()
	{
		return "Welcome to India";
	}
	
	@GetMapping("/greet")
	@ResponseBody
	public String greetMsg()
	{
		return "Good Evening....!!";
	}

}
