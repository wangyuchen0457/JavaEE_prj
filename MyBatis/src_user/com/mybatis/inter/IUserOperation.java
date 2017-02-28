package com.mybatis.inter;

import com.mybatis.model.User;

public interface IUserOperation {
	public User selectUserByID(int id);

}