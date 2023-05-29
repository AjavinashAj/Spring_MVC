package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	@RequestMapping("/")
	public String home()
	{
		System.out.println("this is home page");
		return "home";
	}
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg()
	{
		ModelAndView mav=new ModelAndView();
				mav.addObject("msg","Welcome To India");
				mav.setViewName("home");
		return mav;
	} 
	@GetMapping("/greet")
	public ModelAndView getGreetMsg() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Good Evening....!!");
		mav.setViewName("home");
		return mav;
	}
}
