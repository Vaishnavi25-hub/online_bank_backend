package com.batch8group4.onlinebank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch8group4.onlinebank.model.Account;
import com.batch8group4.onlinebank.repo.AccountRepo;
import com.batch8group4.onlinebank.repo.CustomerRepo;

@Service
public class AccountService {

	@Autowired
	private AccountRepo accountRepo;
	@Autowired
	private CustomerRepo customerRepo;
	
	public List<Account> getAllAccounts()
	{
		return accountRepo.findAll();
	}

	public Optional<Account> getAccountByAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		
		return accountRepo.findById(accountNumber);
	}
	@Transactional
	public String approveAccount(String customer_id)
	{
		Account account= new Account(); 
		account.setCustomerId(customer_id);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHssmm");
		String dateString = dateFormat.format(new Date());
		account.setAccountNumber(dateString);
		account.setAccountBalance(500l);
		accountRepo.save(account);
		customerRepo.setApprovedBoolById(customer_id);
		return "Account successfully created with account Number " + dateString + "!";
		 
			
		
		
	}
}
