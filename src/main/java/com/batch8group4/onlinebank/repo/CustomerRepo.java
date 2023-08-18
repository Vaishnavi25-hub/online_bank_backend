package com.batch8group4.onlinebank.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.batch8group4.onlinebank.model.Customer;

import java.util.List;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,String> {
    @Modifying
    @Query(value="UPDATE CUSTOMER SET APPROVED_BOOL=1 WHERE CUSTOMER_ID=:customer_id",nativeQuery=true)
    void setApprovedBoolById(@Param("customer_id")String customer_id);

    @Query(value = "SELECT * FROM CUSTOMER WHERE APPROVED_BOOL=0",nativeQuery = true)
    List<Customer> getUnapprovedCustomers();
    
}