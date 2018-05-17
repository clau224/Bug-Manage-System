package com.SSM.service;

import java.util.List;

import com.SSM.pojo.User;

public interface UserService {
	//检索全部用户
	List<User>queryAllUsers();
	//添加用户
	void addUser(User user);
	
	//按条件检索用户
	List<User>queryUserByItems(User user);
    //删除操作
	void deletUser(User user);
}
