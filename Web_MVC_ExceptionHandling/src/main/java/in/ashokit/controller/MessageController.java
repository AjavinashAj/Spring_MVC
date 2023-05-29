package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ResponseBody
public class MessageController {
	
	@GetMapping("/welcome")
	
	public String getWelcomeMsg() {
		String msg="Welcome to India";
		//try {
		  int a=10/0;
		  // }
		 //  catch(ArithmeticException e)
		//{
		//	   e.printStackTrace();
		//}
		return msg;
	}
	
	@GetMapping("/greet")
	public String getGreetMsg() {
		
		String msg="Good Evening...!!";
		return msg;
	}
	

}
