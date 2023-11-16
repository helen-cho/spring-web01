package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.dao.StuDAO;
import com.example.domain.QueryVO;

import java.util.*;

@RestController
@RequestMapping("/stu")
public class StuRestController {
	@Autowired
	StuDAO dao;
	
	@GetMapping("/list.json")
	public List<HashMap<String,Object>> list(QueryVO vo){
		return dao.list(vo);
	}
	
	@GetMapping("/total")
	public int total(QueryVO vo) {
		return dao.total(vo);
	}
	
	@GetMapping("/read.json")
	public HashMap<String,Object> list(String scode){
		return dao.read(scode);
	}
}
