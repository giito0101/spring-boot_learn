package com.practice.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HeloController5{
//	@RequestMapping(value="/")
	public ModelAndView index(ModelAndView mav){
		mav.setViewName("index4");
		return mav;
	}
//	@RequestMapping(value="/other")
	public String other(){
		return "redirect:/";
	}
//	@RequestMapping(value="/home")
	public String home(){
		return "forward:/";
	}
	//ModelAndViewのインスタンスを引数に取った場合も、
	//ModelAndViewをreturnでnewしてから動くかどうかの確認。
//	@RequestMapping(value="/test")
	public ModelAndView test(ModelAndView mav){
		mav.setViewName("index3");
		return new ModelAndView("forward:/");
	}
}