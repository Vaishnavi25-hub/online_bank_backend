package com.batch8group4.onlinebank.service;

import java.util.List;
import java.util.Optional;
import java.text.ParseException; import java.text.SimpleDateFormat; import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.batch8group4.onlinebank.model.Customer;
import com.batch8group4.onlinebank.repo.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepo customerRepo;
	
	public List<Customer> getAllCustomers()
	{
		return customerRepo.findAll();
	}

	public Optional<Customer> getCustomerById(String id) {
		// TODO Auto-generated method stub
		
		return customerRepo.findById(id);
	}

	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
//		Long appendId=customer.getSerialNumber();
//		String appendString=appendId.toString();
		SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMHHmmss");
		String dateString = dateFormat.format(new Date());
//		String custId=dateString+appendString;
		customer.setCustomerId(dateString);
		customer.setApprovedBool(0);
		return customerRepo.save(customer);
			}
	
	public void deleteCustomerById(String id)
	{
		customerRepo.deleteById(id);
	}
	
	public Customer changePhoneNumber(String id,String newMobileNumber)
	{
		Optional<Customer> optionalCustomer=customerRepo.findById(id);
		if (optionalCustomer.isPresent()) {
			Customer customer=optionalCustomer.get();
			customer.setMobileNumber(newMobileNumber);
			return customerRepo.save(customer);
			
		}
		return null;
	}
}
