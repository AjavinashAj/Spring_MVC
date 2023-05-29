package in.ashokit.exceptionhandle;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value=Exception.class)
	public ModelAndView handleAE(Exception e)
	{
		ModelAndView mav= new ModelAndView();
		mav.setViewName("error");
		return mav;
	}
}
