package com.practice.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController9 {

//	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index7");
		ArrayList<String[]> data = new ArrayList<String[]>();
		data.add(new String[]{"taro","taro@yamada","090-999-999"});
		data.add(new String[]{"hanako","hanako@flower","080-888-888"});
		data.add(new String[]{"sachiko","sachio@happy","080-888-888"});
		mav.addObject("data",data);
		return mav;
	}
}
