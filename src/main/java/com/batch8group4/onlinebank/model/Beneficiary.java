package com.batch8group4.onlinebank.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Beneficiary")
public class Beneficiary {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(nullable=false)
	private String beneficiaryName;
	@Column(nullable=false)
	private String beneficiaryAccountNumber;
	@Column(nullable=true)
	private String nickName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBeneficiaryName() {
		return beneficiaryName;
	}
	public void setBeneficiaryName(String beneficiaryName) {
		this.beneficiaryName = beneficiaryName;
	}
	public String getBeneficiaryAccountNumber() {
		return beneficiaryAccountNumber;
	}
	public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
		this.beneficiaryAccountNumber = beneficiaryAccountNumber;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	

}
