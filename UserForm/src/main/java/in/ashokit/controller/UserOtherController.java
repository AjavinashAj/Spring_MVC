package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.binding.Register;
import in.ashokit.binding.User;

@Controller
public class UserOtherController {

	// Query param /Request parameter with return type is ModelAndView
	@GetMapping("/msg")
	public ModelAndView getMsg(@RequestParam String name) {
		String msg = name + "Good Evening";
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", msg);
		mav.setViewName("index");
		return mav;
	}
    @PostMapping("/user")
	public ModelAndView holdData(User user) {
		System.out.println(user);
		ModelAndView mav=new ModelAndView();
        mav.addObject("msg",user);
        mav.setViewName("index");
        return mav;
	}

	// Query param/Request parameter with return type is String
	@GetMapping("/abc")
	public String getMsg1(@RequestParam String name, Model model) {
		String s = name + "Hiii";
		model.addAttribute("msg", s);
		return "index";
	}
	
	@PostMapping("/abc")
	public String getMsg2(User user,Model model)
	{
	   System.out.println(user);	
	   model.addAttribute("msg", user);
	   return "index";
	}
	@GetMapping("/mod")
	public String getMess(Model model)
	{
		model.addAttribute("msg", "Hello India");
		return "register";
	}
	@PostMapping("/mod")
	public String getMessage1(Register reg,Model model)
	{   
		System.out.println(reg);
		model.addAttribute("msg",reg);
		return"register";
	}
	

	// path parameter /URI param with ModelAndView as return type
	@GetMapping("/al/{cardId}")
	public ModelAndView getMsg2(@PathVariable Integer cardId) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ms", cardId + "is got job");
		mav.setViewName("index");
		return mav;
	}

	// path parameter/URI param with String as return type
	@GetMapping("/avi/{author}/{name}")
	public String getMsg3(@PathVariable String name, @PathVariable String author, Model model) {
		model.addAttribute("ooo", "hiiii" + name);
		model.addAttribute("ooo", "book" + name + "and author" + author);
		return "index";
	}

	// Request Mapping Read provided form data
	@RequestMapping("/hii")
	public String msg(@RequestParam("name") String name, @RequestParam("email") String email,
			@RequestParam("phno") Long phno, Model model) {
		String n = "avinash";

		if (n.equals(name)) {
			model.addAttribute("avi", "Hii" + name);
		} else {
			model.addAttribute("avi", "sorry");
		}

		return "index";
	}

}
