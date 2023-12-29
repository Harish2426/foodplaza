package com.dao;

import java.util.List;

import com.dto.UserDTO;

public interface UserDao {
	boolean saveUser(UserDTO user);
	boolean updateUser(UserDTO user);
	boolean deleteUser(String email);
	List<UserDTO> searchUser(String email);
	List<UserDTO> showAllUser();
}