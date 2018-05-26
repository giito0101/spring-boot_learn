package com.practice.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController11 {

//	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index9");
		ArrayList<DataObject> data = new ArrayList<DataObject>();
		data.add(new DataObject(0,"taro","taro@yamada"));
		data.add(new DataObject(1,"hanako","hanako@flower"));
		data.add(new DataObject(2,"sachiko","sachiko@happy"));
		mav.addObject("data",data);
		return mav;
	}
}
