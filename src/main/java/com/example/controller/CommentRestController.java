package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.CommentDAO;
import com.example.domain.CommentVO;

import java.util.*;

@RestController
@RequestMapping("/comments")
public class CommentRestController {
	@Autowired
	CommentDAO dao;
	
	@GetMapping("/list.json") //localhost:8080/comments/list.json?pid=517&page=1&size=3
	public List<HashMap<String,Object>> list(int pid, int page, int size){
		return dao.list(pid, page, size);
	}
	
	@GetMapping("/total")
	public int total(int pid) {
		return dao.total(pid);
	}
	
	@PostMapping("/insert")
	public void insert(@RequestBody CommentVO vo) {
		dao.insert(vo);
	}
	
	@GetMapping("/delete")
	public void delete(int cid) {
		dao.delete(cid);
	}
}








