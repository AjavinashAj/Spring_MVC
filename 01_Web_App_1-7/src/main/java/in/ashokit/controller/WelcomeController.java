package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/")
	public ModelAndView getMessage(Model model)
	{
		ModelAndView mav= new ModelAndView();
		mav.addObject("msg","welcome controller page");
		mav.setViewName("index");
		return mav;
	}
	@GetMapping("/first")
public String getLook()
{
	
	return "first";
}
	@GetMapping("/example")
	public String report()
	{
		return "example";
	}

}
