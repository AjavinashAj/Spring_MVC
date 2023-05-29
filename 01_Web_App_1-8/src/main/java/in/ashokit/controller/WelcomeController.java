package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/avi")
	public ModelAndView show(Model model)
	{
		String str="Welcome Avinash!!!";
		ModelAndView mav=new ModelAndView();
		 mav.addObject("msg", str);
		 mav.setViewName("index");
		 return mav;
	}
	
   //Query param/RequestParam
	
   @GetMapping("/msg")
   public ModelAndView getMsg(@RequestParam String name)
   {
	   String msgtxt=name+",Good Evening";
	   ModelAndView mav=new ModelAndView();
	   mav.addObject("msg", msgtxt);
	   mav.setViewName("index");
	   return mav;
   }
   @GetMapping("/book")
   public ModelAndView getBookData(@RequestParam String name, @RequestParam String author)
   {
	   System.out.println("Name:"+name);
	   System.out.println("Author:"+author);
	   ModelAndView mav=new ModelAndView();
	   mav.addObject("msg", name+"by-"+author);
	   mav.setViewName("index");
	   return mav;
   }
   
   //Path parameters/URI param
   
   @GetMapping("/car/{carId}/hyd")
   public ModelAndView getCarColor(@PathVariable Integer carId)
   {
	   ModelAndView mav=new ModelAndView();
	   String color=null;
	   if(carId>=100)
	   {
		   color="Red";
	   }
	   else
	   {
		   color="Black";
	   }
	   mav.addObject("msg", "car color is:"+color);
	   mav.setViewName("index");
	   return mav;
   }
   
   @GetMapping("/stack/{brand}/{loc}")
   public ModelAndView getCar(@PathVariable String brand ,@PathVariable String loc) {
	   
	   ModelAndView mav=new ModelAndView();
	   mav.addObject("msg", loc+" "+brand);
	   mav.setViewName("index");
	   return mav;
   }
   
   @GetMapping("/greet")
   public String getGreetMsg(@RequestParam String name,Model model)
   {
	   model.addAttribute("msg",name+",Good Evening");
	   return "index";
   }
   
   
   
}
