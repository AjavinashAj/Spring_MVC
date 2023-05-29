package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.binding.Register;

@Controller
public class RegisterController {

	@GetMapping("/rg")
	public ModelAndView loadRegister() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("rel", "Welcome To Registration");
		mav.setViewName("register");
		return mav;
	}

	@RequestMapping("/register")
	public ModelAndView handleRegister(Register reg) {
		System.out.println(reg);
		ModelAndView mav = new ModelAndView();
		mav.addObject("rel", reg);
		
		mav.addObject("rel",
				reg.getName() + " " + reg.getAddr() + " " + reg.getEmail() + " " + reg.getPhno() + " " + reg.getPwd());
		mav.setViewName("register");
		return mav;
		
	}
     
	@GetMapping("/mo")
	public String getMessage(Model model) {
      
		model.addAttribute("msg","Hii Avinash");
		return "register";
	}
	
	@PostMapping("/mo")
	public String getM(Register reg,Model model)
	{
		System.out.println(reg);
		model.addAttribute("msg",reg);
		return"register";
	}
}
