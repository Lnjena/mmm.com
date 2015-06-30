package com.mmm.product.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class Product implements Serializable {

	private static final long serialVersionUID = 8355610685877466789L;

	@Id
	private String productId;
	private String productDescription;
	private String productType;
	private Double productCost;
	private PricingDetails pricingDetails;
	private ShippingDetails shippingDetails;
	private AdditionalInfo additionalInfo;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Double getProductCost() {
		return productCost;
	}

	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}

	public PricingDetails getPricingDetails() {
		return pricingDetails;
	}

	public void setPricingDetails(PricingDetails pricingDetails) {
		this.pricingDetails = pricingDetails;
	}

	public ShippingDetails getShippingDetails() {
		return shippingDetails;
	}

	public void setShippingDetails(ShippingDetails shippingDetails) {
		this.shippingDetails = shippingDetails;
	}

	public AdditionalInfo getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(AdditionalInfo additionalInfo) {
		this.additionalInfo = additionalInfo;
	}
}
