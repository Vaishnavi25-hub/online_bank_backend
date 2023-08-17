package com.batch8group4.onlinebank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.batch8group4.onlinebank.model.NetBankingDetails;

public interface NetBankingDetailsRepo extends JpaRepository<NetBankingDetails,String>  {
	@Query(value="SELECT ACCOUNT_NUMBER FROM NET_BANKING WHERE USER_NAME=:username",nativeQuery=true)
	String findAccountNumberById(String username);

	@Query(value="SELECT ACCOUNT_NUMBER FROM NET_BANKING WHERE ACCOUNT_NUMBER=:beneficiaryAccountNumber",nativeQuery=true)
	boolean toAccountExists(String beneficiaryAccountNumber);
	
	@Query(value="SELECT PASSWORD FROM NET_BANKING WHERE USER_NAME=:username", nativeQuery=true)
	String getPasswordByUsername(String username);

}
