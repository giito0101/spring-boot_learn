package com.practice.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController4 {

//	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index2");
		mav.addObject("msg", "current data");
		DataObject obj = new DataObject(123,"hanako","hanako@flower");
		mav.addObject("object",obj);
		return mav;
	}
}
