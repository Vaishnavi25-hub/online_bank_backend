package com.batch8group4.onlinebank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batch8group4.onlinebank.model.NetBankingDetails;

public interface NetBankingDetailsRepo extends JpaRepository<NetBankingDetails,String>  {

}
