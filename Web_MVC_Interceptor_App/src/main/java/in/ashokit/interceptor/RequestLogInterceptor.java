package in.ashokit.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class RequestLogInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("PreHandle() method.......");
		
		//Calculate Each Request Processing Time
		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		
		//Request Authentication
		String clientId=request.getParameter("clientId");
		if("ashokit".equals(clientId))
		{
			return true;
		}
		response.getWriter().print("Invalid Request");
		
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("postHandle() method....");
		
		//Calculate Each Request Processing Time
		long endTime = System.currentTimeMillis();
		
		long startTime = (long) request.getAttribute("startTime");
		
		long time=endTime-startTime;
		
		System.out.println("Total time taken (MS):"+time);
		
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

}
