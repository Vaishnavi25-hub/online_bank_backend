package com.batch8group4.onlinebank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch8group4.onlinebank.model.Transaction;
import com.batch8group4.onlinebank.repo.TransactionRepo;



@Service
public class TransactionService {

	@Autowired
	private TransactionRepo transactionRepo;
	
	public Transaction createTransaction(Transaction transaction) {
		return transactionRepo.save(transaction);
	}
	
}
