package com.practice.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController9{
	@RequestMapping(value="/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index8");
		return mav;
	}
}