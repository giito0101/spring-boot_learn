package com.practice.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController7 {

//	@RequestMapping("/{id}")
	public ModelAndView index(@PathVariable int id,ModelAndView mav){
		mav.setViewName("index5");
		mav.addObject("id",id);
		mav.addObject("check",id > 0);
		mav.addObject("trueVal","POSITIVE!");
		mav.addObject("falseVal","negative...");
		return mav;
	}
}
