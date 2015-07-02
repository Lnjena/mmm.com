package com.mmm.partner.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="vendor")
public class Vendor extends Partner implements Serializable {

	private static final long serialVersionUID = -611649833109909042L;

	@Id
	private String vendorId;

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

}
