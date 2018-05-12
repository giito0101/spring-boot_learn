package com.practice.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController2{
//	@RequestMapping("/{num}")
	public ModelAndView index(@PathVariable int num,ModelAndView mav){
		int res = 0;
		for(int i = 1; i <= num;i++)
			res += i;

		mav.addObject("msg","total: " + res);
		mav.setViewName("index");
		return mav;
	}
}