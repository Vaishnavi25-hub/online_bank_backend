package com.batch8group4.onlinebank.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.batch8group4.onlinebank.model.Beneficiary;

public interface BeneficiaryRepo extends JpaRepository <Beneficiary,Long>{

}
