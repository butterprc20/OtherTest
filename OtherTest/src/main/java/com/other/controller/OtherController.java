package com.other.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OtherController {

	@GetMapping("/other.do")
	public String home() throws Exception {
		return "other.html";
	}

}
