package com.batch8group4.onlinebank.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch8group4.onlinebank.dto.AddBeneficiary;
import com.batch8group4.onlinebank.model.Beneficiary;
import com.batch8group4.onlinebank.model.NetBankingDetails;
import com.batch8group4.onlinebank.repo.BeneficiaryRepo;
import com.batch8group4.onlinebank.repo.NetBankingDetailsRepo;

@Service
public class BeneficiaryService {
	@Autowired 
	private BeneficiaryRepo beneficiaryRepo;
	@Autowired
	private NetBankingDetailsRepo netBankingDetailsRepo;
	public String addBeneficiary(AddBeneficiary addBeneficiary, String username) {
		// TODO Auto-generated method stub
		Beneficiary beneficiary=new Beneficiary();
		String fromAccountNumber=netBankingDetailsRepo.findAccountNumberById(username);
		beneficiary.setBeneficiaryAccountNumber(fromAccountNumber);
		beneficiary.setBeneficiaryName(addBeneficiary.getBeneficiaryName());
		beneficiary.setBeneficiaryAccountNumber(addBeneficiary.getBeneficiaryAccountNumber());
		beneficiary.setNickName(addBeneficiary.getBeneficiaryNickName());
		if (netBankingDetailsRepo.toAccountExists(addBeneficiary.getBeneficiaryAccountNumber()))
		{
			beneficiaryRepo.save(beneficiary);
			return "Beneficiary added";
		}
		return "Beneficiary's account number invalid!";
		
		
	}
	
	
	

}
