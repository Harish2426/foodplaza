package com.service;

import java.util.List;

import com.dto.UserDTO;

public interface UserService {
	boolean saveUser(UserDTO user);
	boolean updateUSer(UserDTO user);
	boolean deleteUser(String email);
	List<UserDTO> searchUser(String email);	
	List<UserDTO> showAllUser();	
}