package com.practice.springboot;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloController{
//	@RequestMapping("/")
	public String index(){
		return "Hello Spring-Boot World!!";
	}
}