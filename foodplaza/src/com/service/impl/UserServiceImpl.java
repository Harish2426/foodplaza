package com.service.impl;

import java.util.List;
import com.dao.*;
import com.dao.impl.*;
import com.dto.UserDTO;
import com.service.UserService;
import com.dao.*;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao = new UserDaoImpl();

	@Override
	public boolean saveUser(UserDTO user) {
		return userDao.saveUser(user);
	}

	@Override
	public boolean deleteUser(String email) {
		return userDao.deleteUser(email);
	}

	@Override
	public List<UserDTO> searchUser(String email) {
		return userDao.searchUser(email);
	}

	@Override
	public List<UserDTO> showAllUser() {
		return userDao.showAllUser();
	}

	@Override
	public boolean updateUSer(UserDTO user) {
		// TODO Auto-generated method stub
		return userDao.updateUser(user);
	}
	
}