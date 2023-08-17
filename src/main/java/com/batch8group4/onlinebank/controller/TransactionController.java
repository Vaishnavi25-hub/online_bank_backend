package com.batch8group4.onlinebank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch8group4.onlinebank.dto.TransactionDto;
import com.batch8group4.onlinebank.model.Beneficiary;
import com.batch8group4.onlinebank.service.TransactionService;

@RestController
@RequestMapping("/transaction")
@CrossOrigin
public class TransactionController {
	@Autowired
	private TransactionService transactionService;
	@PostMapping("/transfer/{fromAccountNumber}")
	public String transferFundRequest(@RequestBody TransactionDto transactionDto, @PathVariable String fromAccountNumber)
	{
		String msg=transactionService.transferFundService(transactionDto, fromAccountNumber);
		return msg;
	}

	
}
