package com.batch8group4.onlinebank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.batch8group4.onlinebank.model.Customer;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,String> {

    @Query(value="UPDATE CUSTOMER SET APPROVED_BOOL=1 WHERE USER_NAME=:custId",nativeQuery=true)
    void setApprovedBoolById(String custId);

    @Query(value = "SELECT * FROM CUSTOMER WHERE APPROVED_BOOL=0",nativeQuery = true)
    List<Customer> getUnapprovedCustomers();
}