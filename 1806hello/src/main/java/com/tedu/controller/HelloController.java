package com.tedu.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController	//SpringBoot专门的注解，标识是一个Controller，返回json
public class HelloController {
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable String name){
		return "springboot "+name;
	}
}
