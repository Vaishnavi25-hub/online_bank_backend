package com.batch8group4.onlinebank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.batch8group4.onlinebank.model.Account;
import com.batch8group4.onlinebank.repo.AccountRepo;

@Service
public class AccountService {

	@Autowired
	private AccountRepo accountRepo;
	
	public List<Account> getAllAccounts()
	{
		return accountRepo.findAll();
	}

	public Optional<Account> getAccountByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		
		return accountRepo.findById(accountNumber);
	}

}
