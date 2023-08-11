package com.batch8group4.onlinebank.model;

import javax.persistence.Column;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class NetBankingDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "user_id")
	private String userId;
	@Column(name = "user_name")
	private String userName;
	@Id
	//set this as foreign key
	private String accountNumber;
	@Column(name = "longinPassword")
	private String loginPasssword;
	@Column(name = "transaction_id")
	private String transactionId;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getLoginPasssword() {
		return loginPasssword;
	}
	public void setLoginPasssword(String loginPasssword) {
		this.loginPasssword = loginPasssword;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
}
