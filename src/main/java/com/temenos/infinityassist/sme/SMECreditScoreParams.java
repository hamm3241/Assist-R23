package com.temenos.infinityassist.sme;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class SMECreditScoreParams implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Integer companyBureauScore = 760;

	private java.lang.Integer partyBureauScore = 790;

	private java.lang.Integer relationshipWithBank = 5;

	private java.lang.Integer yearsOfEmployment = 15;

	private java.lang.String managementAssessment = "Key person with legal heir";

	private java.lang.Double financialLeverage = 2.2;

	private java.lang.Double dSCR = 3.1;

	private java.lang.Double operatingMargin = 0.3;

	private java.lang.Double netProfitMargin = 0.9;

	private java.lang.String productIdentifier = "SME.OVERDRAFT";

	private java.lang.Double currentRatio = 2.5;

	private java.lang.Double debtServiceCoverRatio = 3.1;

	public SMECreditScoreParams() {
	}

	public java.lang.Integer getCompanyBureauScore() {
		return this.companyBureauScore;
	}

	public void setCompanyBureauScore(java.lang.Integer companyBureauScore) {
		this.companyBureauScore = companyBureauScore;
	}

	public java.lang.Integer getPartyBureauScore() {
		return this.partyBureauScore;
	}

	public void setPartyBureauScore(java.lang.Integer partyBureauScore) {
		this.partyBureauScore = partyBureauScore;
	}

	public java.lang.Integer getRelationshipWithBank() {
		return this.relationshipWithBank;
	}

	public void setRelationshipWithBank(java.lang.Integer relationshipWithBank) {
		this.relationshipWithBank = relationshipWithBank;
	}

	public java.lang.Integer getYearsOfEmployment() {
		return this.yearsOfEmployment;
	}

	public void setYearsOfEmployment(java.lang.Integer yearsOfEmployment) {
		this.yearsOfEmployment = yearsOfEmployment;
	}

	public java.lang.String getManagementAssessment() {
		return this.managementAssessment;
	}

	public void setManagementAssessment(java.lang.String managementAssessment) {
		this.managementAssessment = managementAssessment;
	}

	public java.lang.Double getFinancialLeverage() {
		return this.financialLeverage;
	}

	public void setFinancialLeverage(java.lang.Double financialLeverage) {
		this.financialLeverage = financialLeverage;
	}

	public java.lang.Double getdSCR() {
		return this.dSCR;
	}

	public void setdSCR(java.lang.Double dSCR) {
		this.dSCR = dSCR;
	}

	public java.lang.Double getOperatingMargin() {
		return this.operatingMargin;
	}

	public void setOperatingMargin(java.lang.Double operatingMargin) {
		this.operatingMargin = operatingMargin;
	}

	public java.lang.Double getNetProfitMargin() {
		return this.netProfitMargin;
	}

	public void setNetProfitMargin(java.lang.Double netProfitMargin) {
		this.netProfitMargin = netProfitMargin;
	}

	public java.lang.String getProductIdentifier() {
		return this.productIdentifier;
	}

	public void setProductIdentifier(java.lang.String productIdentifier) {
		this.productIdentifier = productIdentifier;
	}

	public java.lang.Double getCurrentRatio() {
		return this.currentRatio;
	}

	public void setCurrentRatio(java.lang.Double currentRatio) {
		this.currentRatio = currentRatio;
	}

	public java.lang.Double getDebtServiceCoverRatio() {
		return this.debtServiceCoverRatio;
	}

	public void setDebtServiceCoverRatio(java.lang.Double debtServiceCoverRatio) {
		this.debtServiceCoverRatio = debtServiceCoverRatio;
	}

	public SMECreditScoreParams(java.lang.Integer companyBureauScore,
			java.lang.Integer partyBureauScore,
			java.lang.Integer relationshipWithBank,
			java.lang.Integer yearsOfEmployment,
			java.lang.String managementAssessment,
			java.lang.Double financialLeverage, java.lang.Double dSCR,
			java.lang.Double operatingMargin, java.lang.Double netProfitMargin,
			java.lang.String productIdentifier, java.lang.Double currentRatio,
			java.lang.Double debtServiceCoverRatio) {
		this.companyBureauScore = companyBureauScore;
		this.partyBureauScore = partyBureauScore;
		this.relationshipWithBank = relationshipWithBank;
		this.yearsOfEmployment = yearsOfEmployment;
		this.managementAssessment = managementAssessment;
		this.financialLeverage = financialLeverage;
		this.dSCR = dSCR;
		this.operatingMargin = operatingMargin;
		this.netProfitMargin = netProfitMargin;
		this.productIdentifier = productIdentifier;
		this.currentRatio = currentRatio;
		this.debtServiceCoverRatio = debtServiceCoverRatio;
	}

}