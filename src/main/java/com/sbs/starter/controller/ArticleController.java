package com.sbs.starter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sbs.starter.dto.Article;
import com.sbs.starter.service.ArticleService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j // 이걸 해야 log.info(..) 가 가능, 디버깅 용도
public class ArticleController {
	@Autowired
	ArticleService articleService;

	@RequestMapping("/article/list")
	public String showList(Model aModel) {
		List<Article> list = articleService.getList();
		
		aModel.addAttribute("list", list);

		return "article/list";
	}
	
	@RequestMapping("/article/add")
	public String showAdd() {
		return "article/add";
	}
}
