package com.practice.springboot;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeloController2{
	//@RequestMapping("/{num}")
	public String index(@PathVariable int num){
		int res =0;
		String str = "";
		for(int i = 1;i <= num;i++){
			res += i;
			str = "total: "+res;
		}
		return str;
	}
}