package com.masaischool.dto;

public class VendorImpl implements Vendor {
     private String vendorId;
     private String vendorName;
     private String vendorEmail;
	public VendorImpl(String vendorId, String vendorName, String venorEmail) {
		
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorEmail = venorEmail;
	}
	
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVenorEmail() {
		return vendorEmail;
	}
	public void setVenorEmail(String venorEmail) {
		this.vendorEmail = venorEmail;
	}
     
	
     
    
}
