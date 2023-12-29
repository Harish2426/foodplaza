package com.service.impl;

import com.dao.AdminDao;
import com.dao.impl.AdminDaoImpl;
import com.dto.AdminDTO;
import com.service.AdminService;

public class AdminServiceImpl implements AdminService {

	AdminDao adminDao = new AdminDaoImpl();
	
	@Override
	public boolean isAdminSave(AdminDTO admin) {
		return adminDao.isAdminSave(admin);
	}

	@Override
	public boolean isAdminDeleted(String username) {
		return adminDao.isAdminDeleted(username);
	}

}
