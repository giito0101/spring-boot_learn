package com.practice.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController12 {

//	@RequestMapping("/{tax}")
	public ModelAndView index(@PathVariable int tax,ModelAndView mav){
		mav.setViewName("index10");
		mav.addObject("tax",tax);
		return mav;
	}
}
