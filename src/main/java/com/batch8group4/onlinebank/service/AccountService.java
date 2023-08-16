package com.batch8group4.onlinebank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.batch8group4.onlinebank.model.Account;
import com.batch8group4.onlinebank.model.Customer;
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

	public String approveAccount(String custId)
	{
		Account account= new Account(); 
//		customerRepo.setApproveBool();
//		customer.setApprovedBool(1);
		account.setCustomerId(custId);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHssmm");
		String dateString = dateFormat.format(new Date());
		account.setAccountNumber(dateString);
		account.setAccountBalance(500l);
		accountRepo.save(account);
		return "Account successfully created with account Number " + dateString + "!";
		 
			
		
		
	}
}
