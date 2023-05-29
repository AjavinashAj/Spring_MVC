package in.ashokit.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomePage {
	
	@GetMapping("/")
	public String firstPage() {
		return "index";	
	}
	
	@GetMapping("/page")
	public String secondPage() {
		return "page";
	}

}
