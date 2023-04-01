package com.masaischool.dto;

public interface Bids {
   
	public String getBidId();
	public void setBidId(String bidId);
	public int getBidAmount();
	public void setBidAmount(int bidAmount);
	public String getBidStatus();
	public void setBidStatus(String bidStatus);
	public Tender getTender();
	public void setTender(Tender tender) ;
	public Vendor getVender();
	public void setVender(Vendor vender);
}
