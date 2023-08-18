package com.batch8group4.onlinebank.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TransactionLog")
public class Transaction {
	
	@Id
	private String referenceId;
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="fromAccount",referencedColumnName="accountNumber")
	private String account;
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


	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
}
