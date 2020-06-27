package com.ggoreb.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MethodController {
	@GetMapping("req/get")
	@RequestMapping(value = "req/get", method = RequestMethod.GET)
	
	
	// 클라이언트의 요청을 받아주는 기능(애노테이션) 
	// 1. @RequestParam
	// 2. @ModelAttribute
	public String get(String page
			, @RequestParam(name = "page_no", defaultValue = "1") int pageNo ) {
		
		return "GET " + page;
	}

	@GetMapping("req/post")
	public String post222() {
		return "POST_GET";
	}

	@PostMapping("req/post")
	public String post(String page) {
		return "POST " + page;
	}
}






