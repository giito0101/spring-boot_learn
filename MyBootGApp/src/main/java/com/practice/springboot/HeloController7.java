package com.practice.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController7{
	@RequestMapping(value="/home")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index6");
		return mav;
	}
}