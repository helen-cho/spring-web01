package com.example.dao;
import java.util.*;

import com.example.domain.CommentVO;

public interface CommentDAO {
	public List<HashMap<String,Object>> list(int pid, int page, int size);
	public int total(int pid);
	public void insert(CommentVO vo);
}
