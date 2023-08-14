package com.batch8group4.onlinebank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch8group4.onlinebank.model.Account;
import com.batch8group4.onlinebank.model.Admin;
import com.batch8group4.onlinebank.model.Customer;
import com.batch8group4.onlinebank.service.AccountService;
import com.batch8group4.onlinebank.service.AdminService;
import com.batch8group4.onlinebank.service.CustomerService;


@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	AdminService adminService;
	@Autowired
	CustomerService customerService;
	@Autowired
	AccountService accountService;
	@GetMapping("/get")
	public List<Admin> getAllAdminsResponse ()
	{
		return adminService.getAllAdmins();
	}
	@PostMapping("/create")
	public ResponseEntity<Admin> postAdminRequest( @RequestBody Admin admin)
	{
		Admin createdAdmin=adminService.createAdmin(admin);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdAdmin);
	}
	@GetMapping("/customer")
	public List<Customer> getAllCustomersResponse ()
	{
		return customerService.getAllCustomers();
	}
	
	@PostMapping("/login")
	public String login(@RequestBody Admin admin)
	{
		String returnMessage=adminService.adminLogin(admin);
		return returnMessage;
	}
	@GetMapping("/{id}")
	public Optional<Customer> getCustomerByIdResponse(@PathVariable String id)
	{
		return customerService.getCustomerById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteCustomerRequest( @PathVariable String id)
	{
		customerService.deleteCustomerById(id);

	}
	
	@GetMapping("/get/accounts")
	public List<Account> getAllAccountsResponse ()
	{
		return accountService.getAllAccounts();
	}
	
	@GetMapping("get/account/{accountNumber}")
	public Optional<Account> getAccountByAccountNumberResponse(@PathVariable String accountNumber)
	{
		return accountService.getAccountByAccountNumber(accountNumber);
	}
	
	

}
