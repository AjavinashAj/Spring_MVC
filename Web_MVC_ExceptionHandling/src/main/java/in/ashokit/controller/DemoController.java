package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class DemoController {
	@GetMapping("/demo")
	public String show()
	{
		int a=10/0;
		return "Demo";
	}

}
