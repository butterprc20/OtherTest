package com.other.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherController {

	@GetMapping("/other.do")
	public String other() throws Exception {
		return "other.html";
	}

	@PostMapping("/other.do")
	public String other2() throws Exception {
		return "other2.html";
	}

	@RequestMapping("/other.do")
	public String other3() throws Exception {
		return "other3.html";
	}

}
