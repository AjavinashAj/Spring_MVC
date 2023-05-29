package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstPage {

	@GetMapping("/")
	public ModelAndView getMessage(Model model) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("mav", "My First Project in MVC");
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/second")
	public String getSecond() {
		return "second";
	}

}
