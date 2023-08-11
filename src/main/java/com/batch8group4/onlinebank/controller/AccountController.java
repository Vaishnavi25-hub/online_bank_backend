package com.batch8group4.onlinebank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch8group4.onlinebank.model.Account;
import com.batch8group4.onlinebank.service.AccountService;


@RestController
@RequestMapping("/api")
public class AccountController {
	@Autowired
	AccountService accountService;
	
	@GetMapping("/account")
	public List<Account> getAllAccountsResponse ()
	{
		return accountService.getAllAccounts();
	}
	
	@GetMapping("/account/{accountNumber}")
	public Optional<Account> getAccountByAccountNumberResponse(@PathVariable String accountNumber)
	{
		return accountService.getAccountByAccountNumber(accountNumber);
	}
}
