package com.dao;

import com.dto.AdminDTO;

public interface AdminDao {
	boolean isAdminSave(AdminDTO admin);
	boolean isAdminDeleted(String username);
}