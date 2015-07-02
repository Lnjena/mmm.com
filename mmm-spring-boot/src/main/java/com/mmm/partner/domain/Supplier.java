package com.mmm.partner.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="supplier")
public class Supplier extends Partner implements Serializable {

	private static final long serialVersionUID = -611649833109909042L;

	@Id
	private String supplierId;

	public String getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
