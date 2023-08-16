package com.batch8group4.onlinebank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.batch8group4.onlinebank.dto.NetBankingLogin;
import com.batch8group4.onlinebank.model.NetBankingDetails;
import com.batch8group4.onlinebank.service.NetBankingDetailsService;

@RestController
@RequestMapping("/netbanking")
public class NetBankingDetailsController {
	 
	@Autowired
	private NetBankingDetailsService netBankingDetailsService;
	
	
	@PostMapping("/create/account/{accountNumber}")
	public String createNetBankingRequest(@PathVariable String accountNumber, @RequestBody NetBankingDetails netBankingDetails)
	{
		String msg=netBankingDetailsService.registerForNetBanking(accountNumber, netBankingDetails);
		return msg;
	}
	
	@GetMapping("/get/users")
	public List<NetBankingDetails> getNetBankingUsersRequest()
	{
		return netBankingDetailsService.getAllNetBankingUsers();
	}
	
//	@PostMapping("/login")
//	public String logInRequest(@RequestBody NetBankingLogin netBankingLogin)
//	{
//		String msg= netBankingDetailsService.login(netBankingLogin);
//			return msg;
//		
//	}
	}


