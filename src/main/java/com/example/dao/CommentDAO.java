package com.example.dao;
import java.util.*;

public interface CommentDAO {
	public List<HashMap<String,Object>> list(int pid, int page, int size);
}
