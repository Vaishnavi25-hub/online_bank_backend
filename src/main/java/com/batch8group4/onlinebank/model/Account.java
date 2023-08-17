package com.batch8group4.onlinebank.model;


import jakarta.persistence.*;


@Entity
@Table(name= "Account")
public class Account {
		@Id

		
		private String accountNumber;
		
		@Column(name = "customer_id")
		//make this foreign key
		private String customerId;
		@Column(name = "account_balance")
		private Long accountBalance;
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
		public Long getAccountBalance() {
			return accountBalance;
		}
		public void setAccountBalance(Long accountBalance) {
			this.accountBalance = accountBalance;
		}
		
	}