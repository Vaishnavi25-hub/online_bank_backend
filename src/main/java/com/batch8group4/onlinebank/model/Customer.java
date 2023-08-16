package com.batch8group4.onlinebank.model;

import java.util.*;
import javax.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import javax.persistence.Transient;
@Entity
@Table(name="Customer")
public class Customer {

//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long serialNumber;
	@Id
	@Column(nullable=false, insertable=false, updatable=false)
	private String customerId;
	@Column(nullable=false, insertable=false, updatable=false)
	private String title;
	@Column(nullable=false, insertable=false, updatable=false)
	private String firstName;
	@Column(nullable=false, insertable=false, updatable=false)
	private String middleName;
	@Column( insertable=false, updatable=false)
	private String lastName;
	@Column(nullable=false, insertable=false, updatable=false)
	private String fatherName;
	@Column(nullable=false, insertable=false, updatable=false)
	private String mobileNumber;
	@Column(nullable=false, insertable=false, updatable=false)
	private String emailId;
	@Column(nullable=true, insertable=false, updatable=false)
	private String adharNumber;
	@Column(nullable=false, insertable=false, updatable=false)
	private String dob;
	@Column(nullable=false, insertable=false, updatable=false)
	private String residentialLine1;
	@Column(nullable=false, insertable=false, updatable=false)
	private String residentialLine2;
	@Column(nullable=false, insertable=false, updatable=false)
	private String residentialLandmark;
	@Column(nullable=true, insertable=false, updatable=false)
	private String residentialState;
	@Column(nullable=false, insertable=false, updatable=false)
	private String residentialPincode;
	@Column(nullable=false, insertable=false, updatable=false)
	private String permanentLine1;
	@Column(nullable=false, insertable=false, updatable=false)
	private String permanentLine2;
	@Column(nullable=false, insertable=false, updatable=false)
	private String permanentLandmark;
	@Column(nullable=true, insertable=false, updatable=false)
	private String permanentState;
	@Column(nullable=false, insertable=false, updatable=false)
	private String permanentPincode;
	@Column(nullable=false, insertable=false, updatable=false)
	private String occupationType;
	@Column(insertable=false, updatable=false)
	private String sourceOfIncome;
	@Column( insertable=false, updatable=false)
	private Long grossAnnualIncome;
	@Column( insertable=false, updatable=false)
	private String netBankingBool;
	@Column(nullable=false, insertable=false, updatable=false)
	private String debitCardBool;
	@Column(nullable=false, insertable=false, updatable=false)
	private int approvedBool;
	@Column(nullable=false, insertable=false, updatable=false)
	public String getCustomerId() {
		
		return customerId;
		//hii
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(String adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public String getNetBankingBool() {
		return netBankingBool;
	}
	public void setNetBankingBool(String netBankingBool) {
		this.netBankingBool = netBankingBool;
	}
	public String getDebitCardBool() {
		return debitCardBool;
	}
	public void setDebitCardBool(String debitCardBool) {
		this.debitCardBool = debitCardBool;
	}
	public String getResidentialLine1() {
		return residentialLine1;
	}
	public void setResidentialLine1(String residentialLine1) {
		this.residentialLine1 = residentialLine1;
	}
	public String getResidentialLine2() {
		return residentialLine2;
	}
	public void setResidentialLine2(String residentialLine2) {
		this.residentialLine2 = residentialLine2;
	}
	public String getResidentialLandmark() {
		return residentialLandmark;
	}
	public void setResidentialLandmark(String residentialLandmark) {
		this.residentialLandmark = residentialLandmark;
	}
	public String getResidentialState() {
		return residentialState;
	}
	public void setResidentialState(String residentialState) {
		this.residentialState = residentialState;
	}
	public String getResidentialPincode() {
		return residentialPincode;
	}
	public void setResidentialPincode(String residentialPincode) {
		this.residentialPincode = residentialPincode;
	}
	public String getPermanentLine1() {
		return permanentLine1;
	}
	public void setPermanentLine1(String permanentLine1) {
		this.permanentLine1 = permanentLine1;
	}
	public String getPermanentLine2() {
		return permanentLine2;
	}
	public void setPermanentLine2(String permanentLine2) {
		this.permanentLine2 = permanentLine2;
	}
	public String getPermanentLandmark() {
		return permanentLandmark;
	}
	public void setPermanentLandmark(String permanentLandmark) {
		this.permanentLandmark = permanentLandmark;
	}
	public String getPermanentState() {
		return permanentState;
	}
	public void setPermanentState(String permanentState) {
		this.permanentState = permanentState;
	}
	public String getpermanentPincode() {
		return permanentPincode;
	}
	public void setpermanentPincode(String permanentPincode) {
		this.permanentPincode = permanentPincode;
	}
	public String getOccupationType() {
		return occupationType;
	}
	public void setOccupationType(String occupationType) {
		this.occupationType = occupationType;
	}
	public String getSourceOfIncome() {
		return sourceOfIncome;
	}
	public void setSourceOfIncome(String sourceOfIncome) {
		this.sourceOfIncome = sourceOfIncome;
	}
	public Long getGrossAnnualIncome() {
		return grossAnnualIncome;
	}
	public void setGrossAnnualIncome(Long grossAnnualIncome) {
		this.grossAnnualIncome = grossAnnualIncome;
	}
	public String getPermanentPincode() {
		return permanentPincode;
	}
	public void setPermanentPincode(String permanentPincode) {
		this.permanentPincode = permanentPincode;
	}
	public int getApprovedBool() {
		return approvedBool;
	}
	public void setApprovedBool(int approvedBool) {
		this.approvedBool = approvedBool;
	}
	
	
		
	}

//	public Long getSerialNumber() {
//		return serialNumber;
//	}
//	public void setSerialNumber(Long serialNumber) {
//		this.serialNumber = serialNumber;
//	}
	

