package com.sbs.starter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/home/main")
	@ResponseBody
	public String showMain() {
		return "메인화면 입니다.";
	}
}
