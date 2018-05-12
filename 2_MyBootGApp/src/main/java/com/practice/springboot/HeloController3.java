package com.practice.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController3{
//	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index2");
		mav.addObject("msg","お名前を書いて送信してください。");
		return mav;
	}
//	@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView send(@RequestParam("text1")String str,
			ModelAndView mav){
		mav.addObject("msg","こんにちは、"+ str +"さん！");
		mav.addObject("value",str);
		mav.setViewName("index2");
		return mav;
	}
}