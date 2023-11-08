package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.PostDAO;
import com.example.domain.PostVO;

@Controller
public class PostController {
	@Autowired
	PostDAO dao;
	
	@GetMapping("/posts")
	public String list(Model model) {
		model.addAttribute("pageName", "posts/list");
		return "home";
	}
	
	
	@GetMapping("/posts/list.json")
	@ResponseBody
	public List<PostVO> list(){
		return dao.list();
	}
}
