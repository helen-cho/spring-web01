package com.example.dao;
import java.util.*;
import com.example.domain.*;

public interface StuDAO {
	public List<HashMap<String,Object>> list(QueryVO vo);
	public int total(QueryVO vo);
}
