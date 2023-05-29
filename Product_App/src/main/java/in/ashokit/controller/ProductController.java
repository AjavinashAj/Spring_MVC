package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {
	@GetMapping("/")
	public ModelAndView getMsg()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Hii Alexendra");
		mav.setViewName("index");
		return mav;
	}
	@GetMapping("/hi")
	public ModelAndView getshow()
	{
		ModelAndView mav=new ModelAndView();
		 String ms="Hii India";
		 mav.addObject("msg",ms);
		 mav.setViewName("index");
		 return mav;
	}
	
	@GetMapping("/sh")
	public String getSh(Model model)
	{
		String st="Hii Shamyuktha";
		model.addAttribute("msg",st);
		return "index";
	}
	
	@GetMapping("/avi")
	public ModelAndView getMsg(@RequestParam String name)
	{
		String st="Hii  "+name;
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg",st);
		mav.setViewName("index");
		return mav;
		
	}
	
	@GetMapping("/p")
	public ModelAndView getP(@RequestParam String name,Double price,int qty)
	{
		ModelAndView mav=new ModelAndView();
		String st= name+" "+qty+" "+price;
		mav.addObject("msg",st);
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/pr/{name}")
	public ModelAndView getP(@PathVariable String name,String price)
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg",name);
		mav.setViewName("index");
		return mav;
	}
	
	@GetMapping("/s")
	public String getshow(@RequestParam String name,Model model)
	{
		model.addAttribute("msg",name);
		return "index";
	}
	
	@GetMapping("/a/{name}")
	public String getShow(@PathVariable String name,Model model)
	{
		model.addAttribute("msg",name);
		return "index";
	}

}
