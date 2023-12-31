package com.batch8group4.onlinebank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.batch8group4.onlinebank.dto.AddBeneficiary;
import com.batch8group4.onlinebank.model.Beneficiary;
import com.batch8group4.onlinebank.model.Customer;
import com.batch8group4.onlinebank.service.BeneficiaryService;
import com.batch8group4.onlinebank.service.CustomerService;
@CrossOrigin
@RestController
@RequestMapping("/api/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@Autowired
	private BeneficiaryService beneficiaryService;
	
	
	@PostMapping("/apply")
	public ResponseEntity<Customer> postCustomerRequest( @RequestBody Customer customer)
	{
		Customer createdCustomer=customerService.createCustomer(customer);
		return ResponseEntity.status(HttpStatus.CREATED).body(createdCustomer);
	}
	
	
	//put mapping for changing the phone number
	@PutMapping("/change/phone/number/{id}/mobile-number")
	public ResponseEntity<Customer> updatePhoneNumberRequest(@PathVariable String id, @RequestParam String newMobileNumber )
	{
		Customer updatedCustomer=customerService.changePhoneNumber(id, newMobileNumber);
		if (updatedCustomer !=null)
		{
			return ResponseEntity.ok(updatedCustomer);
		}
		else
		{
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping("/add/beneficiary/{username}")
	public String addBeneficiaryRequest(@RequestBody AddBeneficiary addBeneficiary ,@PathVariable String username)
	{
		String msg= beneficiaryService.addBeneficiary(addBeneficiary,username);
		return msg;
	}

}
