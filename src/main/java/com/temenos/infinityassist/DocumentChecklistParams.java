package com.temenos.infinityassist;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class DocumentChecklistParams implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String product;
	private java.lang.String entityType;
	private java.lang.String employmentType;
	private java.lang.String companyType;
	private java.lang.String lineOfBusiness;

	private java.lang.String facilityDecision;

	private java.lang.String propertySubType;

	private java.lang.String mortgagePurpose;

	public DocumentChecklistParams() {
	}

	public java.lang.String getProduct() {
		return this.product;
	}

	public void setProduct(java.lang.String product) {
		this.product = product;
	}

	public java.lang.String getEntityType() {
		return this.entityType;
	}

	public void setEntityType(java.lang.String entityType) {
		this.entityType = entityType;
	}

	public java.lang.String getEmploymentType() {
		return this.employmentType;
	}

	public void setEmploymentType(java.lang.String employmentType) {
		this.employmentType = employmentType;
	}

	public java.lang.String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(java.lang.String companyType) {
		this.companyType = companyType;
	}

	public java.lang.String getLineOfBusiness() {
		return this.lineOfBusiness;
	}

	public void setLineOfBusiness(java.lang.String lineOfBusiness) {
		this.lineOfBusiness = lineOfBusiness;
	}

	public java.lang.String getFacilityDecision() {
		return this.facilityDecision;
	}

	public void setFacilityDecision(java.lang.String facilityDecision) {
		this.facilityDecision = facilityDecision;
	}

	public java.lang.String getPropertySubType() {
		return this.propertySubType;
	}

	public void setPropertySubType(java.lang.String propertySubType) {
		this.propertySubType = propertySubType;
	}

	public java.lang.String getMortgagePurpose() {
		return this.mortgagePurpose;
	}

	public void setMortgagePurpose(java.lang.String mortgagePurpose) {
		this.mortgagePurpose = mortgagePurpose;
	}

	public DocumentChecklistParams(java.lang.String product,
			java.lang.String entityType, java.lang.String employmentType,
			java.lang.String companyType, java.lang.String lineOfBusiness,
			java.lang.String facilityDecision,
			java.lang.String propertySubType, java.lang.String mortgagePurpose) {
		this.product = product;
		this.entityType = entityType;
		this.employmentType = employmentType;
		this.companyType = companyType;
		this.lineOfBusiness = lineOfBusiness;
		this.facilityDecision = facilityDecision;
		this.propertySubType = propertySubType;
		this.mortgagePurpose = mortgagePurpose;
	}

}