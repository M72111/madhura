package com.ecommerce;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="eproduct")
public class Eproduct {

	@Id
	@GeneratedValue
	@Column(name="ID")
	private int ID;

	@Column(name="name")
	private String name;

	@Column(name="price")
	private Double price;

	@Column(name="date_added")
	private Date date_added;
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

		
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Date getDate_added() {
		return date_added;
	}

	public void setDate_added(Date date_added) {
		this.date_added = date_added;
	}
	
}
