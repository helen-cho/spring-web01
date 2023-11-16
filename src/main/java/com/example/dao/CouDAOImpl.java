package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.QueryVO;

@Repository
public class CouDAOImpl implements CouDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.CourseMapper";
	
	@Override
	public List<HashMap<String, Object>> list(QueryVO vo) {
		vo.setStart((vo.getPage()-1) * vo.getSize());
		return session.selectList(namespace + ".list", vo);
	}

	@Override
	public int total(QueryVO vo) {
		return session.selectOne(namespace + ".total", vo); 
	}

	@Override
	public HashMap<String, Object> read(String lcode) {
		return session.selectOne(namespace + ".read", lcode);
	}

}
