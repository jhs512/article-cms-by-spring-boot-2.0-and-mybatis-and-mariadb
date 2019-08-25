package com.sbs.starter.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbs.starter.dto.Member;
import com.sbs.starter.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	@Autowired
	MemberService memberService;

	@RequestMapping("/home/main")
	public String showMain(HttpSession session, Model model) {
		long loginedMemberId = 0;

		if (session.getAttribute("loginedMemberId") != null) {
			loginedMemberId = (long) session.getAttribute("loginedMemberId");
		}

		Member loginedMember = memberService.getOne(loginedMemberId);
		
		model.addAttribute("loginedMember", loginedMember);

		return "home/main";
	}

	@RequestMapping("/")
	public String showMain2() {
		return "redirect:/home/main";
	}
}
