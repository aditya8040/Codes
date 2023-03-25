package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Product {
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pId;
	private String pName;
	private int PQuantity;
	
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPQuantity() {
		return PQuantity;
	}
	public void setPQuantity(int pQuantity) {
		PQuantity = pQuantity;
	}
	
	
	

}
