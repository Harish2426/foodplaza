package com.service;

import com.dto.AdminDTO;

public interface AdminService {
	boolean isAdminSave(AdminDTO admin);
	boolean isAdminDeleted(String username);
}