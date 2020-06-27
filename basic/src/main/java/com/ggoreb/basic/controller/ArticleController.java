package com.ggoreb.basic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ggoreb.basic.model.Article;
import com.ggoreb.basic.repository.ArticleRepository;

@Controller
public class ArticleController {
	@Autowired
	ArticleRepository articleRepository;
	
	@GetMapping("/article")
	public String article(Model model) {
		List<Article> list = articleRepository.findAll();
		model.addAttribute("list", list);
		return "article";
	}
	
}










