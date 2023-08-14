package com.batch8group4.onlinebank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch8group4.onlinebank.model.Account;
import com.batch8group4.onlinebank.model.Admin;
import com.batch8group4.onlinebank.model.Customer;
import com.batch8group4.onlinebank.repo.AccountRepo;
import com.batch8group4.onlinebank.repo.AdminRepo;
@Service
public class AdminService {
	@Autowired
	AdminRepo adminRepo;
	@Autowired 
	AccountService accountService;
	@Autowired 
	AccountRepo accountRepo;
	

	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		
		return adminRepo.findAll();
	}

	public Admin createAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminRepo.save(admin);
	}

	public String adminLogin(Admin admin) {
		String uName=admin.getUserName();
		String password=admin.getPassword();
		int id=admin.getAdminId();
		String passwordFromRepo=adminRepo.getPassword(uName);
		if (password.equals(passwordFromRepo))
		{
			return "Log in successful";
		}
		else
		{
			return "access denied";
		}
		
	}
	
	

}
