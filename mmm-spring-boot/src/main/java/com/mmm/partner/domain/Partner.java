package com.mmm.partner.domain;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "partner")
public class Partner implements Serializable {

	private static final long serialVersionUID = 5218143967349070770L;

	private Long partnerId;
	private Long addressId;
	private Long contactId;
	private String partnerType;
	private String partnerRegistrationNumber;
	private String partnerName;

	public Long getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(Long partnerId) {
		this.partnerId = partnerId;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getPartnerType() {
		return partnerType;
	}

	public void setPartnerType(String partnerType) {
		this.partnerType = partnerType;
	}

	public String getPartnerRegistrationNumber() {
		return partnerRegistrationNumber;
	}

	public void setPartnerRegistrationNumber(String partnerRegistrationNumber) {
		this.partnerRegistrationNumber = partnerRegistrationNumber;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
}
