package com.batch8group4.onlinebank.controller;

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

import com.batch8group4.onlinebank.model.Customer;
import com.batch8group4.onlinebank.model.NetBanking;
import com.batch8group4.onlinebank.service.NetBankingService;

@RestController
@RequestMapping("/netapi")
public class NetBankingController {
	@Autowired
	private NetBankingService netBankingService;
	@PostMapping("/netBanking/openAccount")
	public ResponseEntity<NetBanking> postNetBankingRequestResponse( @RequestBody NetBanking netBankingObj)
	{
		NetBanking createdNetBankingAccount = netBankingService.createNetBankingAccount(netBankingObj);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdNetBankingAccount);
	}
	@GetMapping("/netBanking/getByAccountNumber/{accountNumber}")
	public Optional<NetBanking> getByAccountNumberResponse( @PathVariable String accountNumber ){
		return netBankingService.getByAccountNumber(accountNumber);
	}
	@GetMapping("/netBanking/getByUserName/{userName}")
	public Optional<NetBanking> getByUserName(@PathVariable String userName)
	{
		return netBankingService.getUserName(userName);
	}
	@DeleteMapping("/netBanking/delete/{userName}")
	public void deleteRequest( @PathVariable String userName)
	{
		netBankingService.deleteByUserName(userName);

	}
}