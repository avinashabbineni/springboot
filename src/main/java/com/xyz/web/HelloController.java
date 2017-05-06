package com.xyz.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xyz.service.HelloService;

@Controller
@ComponentScan("com.xyz.service")
public class HelloController {

	@Autowired
	HelloService srv;
	
	@RequestMapping("/")
	public String getDetails(Map<String,Object> model){
		model.put("message", srv.getDetails());
		return "Hello";
	}
}
