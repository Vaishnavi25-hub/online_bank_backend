package com.batch8group4.onlinebank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch8group4.onlinebank.dto.TransactionDto;
import com.batch8group4.onlinebank.model.Beneficiary;
import com.batch8group4.onlinebank.model.Transaction;
import com.batch8group4.onlinebank.repo.AccountRepo;
import com.batch8group4.onlinebank.repo.TransactionRepo;
@Service
public class TransactionService {
	@Autowired
	private TransactionRepo transactionRepo;
	@Autowired
	private AccountRepo accountRepo;
	public String transferFundService(TransactionDto transactionDto) {
		Transaction transaction=new Transaction();
		transaction.setAmount(transactionDto.getAmount());
		transaction.setFromAccount(null);
		// TODO Auto-generated method stub
		return null;
	}

}
