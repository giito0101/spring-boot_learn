package com.practice.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController13 {

//	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("fragment/index");
		return mav;
	}
}
