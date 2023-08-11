package com.batch8group4.onlinebank.model;

import javax.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name= "Account")
public class Account {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "account_number")
		private String accountNumber;
		
		@Column(name = "customer_id")
		//make this foreign key
		private String customerId;
		@Column(name = "account_balance")
		private String accountBalance;
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getCustomerId() {
			return customerId;
		}
		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}
		public String getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(String accountBalance) {
			this.accountBalance = accountBalance;
		}
		
	}