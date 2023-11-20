package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.EnrollDAO;
import com.example.domain.EnrollVO;

@Service
public class EnrollServiceImpl implements EnrollService{
	@Autowired
	EnrollDAO dao;
	
	@Transactional
	@Override
	public void delete(EnrollVO vo) {
		dao.delete(vo);
		dao.persons(vo.getLcode(), -1);
	}

	@Transactional
	@Override
	public void insert(String scode, String lcode) {
		dao.insert(scode, lcode);
		dao.persons(lcode, 1);
	}
}
