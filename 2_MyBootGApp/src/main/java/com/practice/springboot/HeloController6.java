package com.practice.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController6{
//	@RequestMapping(value="/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index5");
		return mav;
	}
//	@RequestMapping(value="/home")
	public ModelAndView home(ModelAndView mav){
		mav.setViewName("index5");
		return mav;
	}
}