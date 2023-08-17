package com.batch8group4.onlinebank.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="TransactionLog")
public class Transaction {
	
	@Id
	private String referenceId;
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="fromAccount",referencedColumnName="accountNumber")
	private String fromAccount;
	private String methodOfPayment;
	private Long amount;
	public String getReferenceId() {
		return referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}
	
	public String getMethodOfPayment() {
		return methodOfPayment;
	}
	public void setMethodOfPayment(String methodOfPayment) {
		this.methodOfPayment = methodOfPayment;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}


	public String getFromAccount() {
		return fromAccount;
	}

	public void setFromAccount(String fromAccount) {
		this.fromAccount = fromAccount;
	}
}
