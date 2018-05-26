package com.practice.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController10 {

	//@RequestMapping("/{num}")
	public ModelAndView index(@PathVariable int num,ModelAndView mav){
		mav.setViewName("index8");
		mav.addObject("num",num);
		if(num > 0){
			mav.addObject("check","num >= data.size() ? 0 : num");
		}else{
			mav.addObject("check","num <= data.size() * -1 ? 0 :num * -1");
		}
		ArrayList<DataObject> data = new ArrayList<DataObject>();
		data.add(new DataObject(0,"taro@yamada","090-999-999"));
		data.add(new DataObject(1,"hanako@flower","080-888-888"));
		data.add(new DataObject(2,"sachio@happy","080-888-888"));
		mav.addObject("data",data);
		return mav;
	}
}
