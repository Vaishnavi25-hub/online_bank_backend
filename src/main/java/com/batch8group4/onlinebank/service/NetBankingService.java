package com.batch8group4.onlinebank.service;

import java.util.Optional;

import com.batch8group4.onlinebank.model.NetBanking;
import com.batch8group4.onlinebank.repo.NetBankingRepo;

public class NetBankingService {

	private NetBankingRepo netBankingRepo;

	public NetBanking createNetBankingAccount(NetBanking netBankingObj) {
		return netBankingRepo.save(netBankingObj);
	}

	public Optional<NetBanking> getByAccountNumber(String accountNumber) {
		
		return netBankingRepo.findByAccountNumber(accountNumber);
	}

	public Optional<NetBanking> getUserName(String userName) {
		return netBankingRepo.findByUserName(userName);
	}

	public void deleteByUserName(String userName) {
		netBankingRepo.deleteById(userName);
	}

}
