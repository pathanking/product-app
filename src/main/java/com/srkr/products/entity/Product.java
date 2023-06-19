package com.srkr.products.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * @author razaa
 */

//@Data
//@NoArgsConstructor
//@AllArgsConstructor

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer prodId;
	private String pname;
	private String description;
	private Double price;

	public Product() {
	}

	public Product(String pname, String description, Double price) {
		this.pname = pname;
		this.description = description;
		this.price = price;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getProdId() {
		return prodId;
	}

	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", pname=" + pname + ", description=" + description + ", price=" + price
				+ "]";
	}
}
