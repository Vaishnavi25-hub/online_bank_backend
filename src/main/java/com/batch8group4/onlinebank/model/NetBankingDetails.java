package com.batch8group4.onlinebank.model;

import javax.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table (name="NetBanking")
public class NetBankingDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long netBankingId;
	private String userName;

	private String accountNumber;
	private String password;
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
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getNetBankingId() {
		return netBankingId;
	}
	public void setNetBankingId(Long netBankingId) {
		this.netBankingId = netBankingId;
	}
	
}
