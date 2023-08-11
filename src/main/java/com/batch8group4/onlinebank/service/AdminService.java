package com.batch8group4.onlinebank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.batch8group4.onlinebank.model.Admin;

public class AdminService {
	@Autowired
	AdminRepo adminRepo;

	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return null;
	}

	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}

	public String adminLogin(Admin admin) {
		String uName=admin.getUserName();
		String password=admin.getPassword();
		s
		// TODO Auto-generated method stub
		return null;
	}

}
