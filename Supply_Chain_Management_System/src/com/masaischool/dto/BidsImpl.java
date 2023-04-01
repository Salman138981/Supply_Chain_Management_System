package com.masaischool.dto;

public class BidsImpl implements Bids{
	 private String bidId;
	 private int bidAmount;
	 private String bidStatus;
	 private Tender tender;
	 private Vendor vender;
	public BidsImpl(String bidId, int bidAmount, String bidStatus, Tender tender, Vendor vender) {
		
		this.bidId = bidId;
		this.bidAmount = bidAmount;
		this.bidStatus = bidStatus;
		this.tender = tender;
		this.vender = vender;
	}
	@Override
	public String getBidId() {
		return bidId;
	}
	@Override
	public void setBidId(String bidId) {
		this.bidId = bidId;
	}
	
	@Override
	public int getBidAmount() {
		return bidAmount;
	}
	
	@Override
	public void setBidAmount(int bidAmount) {
		this.bidAmount = bidAmount;
	}
	
	@Override
	public String getBidStatus() {
		return bidStatus;
	}
	
	@Override
	public void setBidStatus(String bidStatus) {
		this.bidStatus = bidStatus;
	}
	
	@Override
	public Tender getTender() {
		return tender;
	}
	
	@Override
	public void setTender(Tender tender) {
		this.tender = tender;
	}
	
	@Override
	public Vendor getVender() {
		return vender;
	}
	
	@Override
	public void setVender(Vendor vender) {
		this.vender = vender;
	}
	 
	
	 

}
