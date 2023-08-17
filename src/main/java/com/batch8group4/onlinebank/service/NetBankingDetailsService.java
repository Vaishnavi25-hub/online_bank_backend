package com.batch8group4.onlinebank.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.batch8group4.onlinebank.dto.NetBankingLogin;
import com.batch8group4.onlinebank.model.NetBankingDetails;
import com.batch8group4.onlinebank.repo.NetBankingDetailsRepo;

@Service

public class NetBankingDetailsService {
	@Autowired
	private NetBankingDetailsRepo netBankingDetailsRepo;
	public String registerForNetBanking(String accountNumber, NetBankingDetails netBankingDetails) {
		
		netBankingDetails.setAccountNumber(accountNumber);
//		netBankingDetails.setUserName(netBankingDetails.getUserName());
//		netbanking.setPassword(netBankingDetails.getPassword());
//		SimpleDateFormat dateFormat = new SimpleDateFormat("ssmmHH");
//		String dateString = dateFormat.format(new Date());
//		netBankingDetails.setNetBankingId(dateString);
		try
		{
		netBankingDetailsRepo.save(netBankingDetails);}
		catch (DataIntegrityViolationException e)
		{
		return "This account is already registered for net banking";
		}
		// TODO Auto-generated method stub
		return "Account Number "+ accountNumber + "is successfully registered for net banking"; 
	}
	
	public List<NetBankingDetails> getAllNetBankingUsers()
	{
		return netBankingDetailsRepo.findAll();
	}

	

	public String login(NetBankingLogin netBankingLogin) {
		String username=netBankingLogin.getUserName();
		String password=netBankingLogin.getPassword()	;
		// TODO Auto-generated method stub
		String daoPassword=netBankingDetailsRepo.getPasswordByUsername(username);
		if (daoPassword == null || daoPassword.isEmpty()) {
                        return "Username does not exist. Register for the net banking firts";
        } else if (password.equals(daoPassword)) {
            
            return "Login successful.";
        } else {
           
            return "Invalid password.";
        }
		
	}

}
