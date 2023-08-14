package com.batch8group4.onlinebank.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.batch8group4.onlinebank.model.Transaction;
import com.batch8group4.onlinebank.service.TransactionService;

@RestController
@RequestMapping("/api")
public class TransactionController {
	private TransactionService transactionService;
	@PostMapping("/creater/transaction")
	public ResponseEntity<Transaction> postTransactionRequest( @RequestBody Transaction transaction)
	{
		Transaction createdTransaction = transactionService.createTransaction(transaction);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdTransaction);
	}
	
}
