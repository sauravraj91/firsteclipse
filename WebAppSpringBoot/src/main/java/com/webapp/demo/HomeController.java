package com.webapp.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	//public String home(HttpServletRequest req)//step1
	//public String home(String name,HttpSession session)//step2
	//public ModelAndView home(@RequestParam("name")String myName)//step3
	public ModelAndView home(Aliens alien)
	{
		//HttpSession session = req.getSession();//step1
		//String name = req.getParameter("name");//step1
		//System.out.println("HI" + name);//step2
		//session.setAttribute("name", name);//step2
		//return "home";//step2
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
	}
}
