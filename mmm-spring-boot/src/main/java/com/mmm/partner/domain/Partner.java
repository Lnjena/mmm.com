package com.mmm.partner.domain;

import java.io.Serializable;

import com.mmm.common.domain.Address;
import com.mmm.common.domain.Contact;

public class Partner implements Serializable {

	private static final long serialVersionUID = 5218143967349070770L;

	private Address address;
	private Contact contact;
	private String partnerType;
	private String partnerRegistrationNumber;
	private String partnerName;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
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
