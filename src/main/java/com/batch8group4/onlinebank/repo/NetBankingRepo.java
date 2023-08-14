package com.batch8group4.onlinebank.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.batch8group4.onlinebank.model.NetBanking;

public interface NetBankingRepo extends JpaRepository<NetBanking, String>{

	Optional<NetBanking> findByAccountNumber(String accountNumber);

	Optional<NetBanking> findByUserName(String userName);

}
