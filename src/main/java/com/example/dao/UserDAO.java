package com.example.dao;
import java.util.*;

import com.example.domain.UserVO;

public interface UserDAO {
	public HashMap<String,Object> read(String uid);
	public UserVO login(String uid);
}
