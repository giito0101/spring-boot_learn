package com.practice.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController5 {

//	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index3");
		mav.addObject("msg", "message 1<br/>message 2<br/>message 3");
		return mav;
	}
}
