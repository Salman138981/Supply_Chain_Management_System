package com.masaischool.dto;

import java.time.LocalDate;

public class TenderImpl implements Tender{ 
      private String tender_id;
      private String tender_name;
      private LocalDate tender_posted_date;
      private LocalDate tender_close_date;
	public TenderImpl(String tender_id, String tender_name, LocalDate tender_posted_date,
			LocalDate tender_close_date) {
		
		this.tender_id = tender_id;
		this.tender_name = tender_name;
		this.tender_posted_date = tender_posted_date;
		this.tender_close_date = tender_close_date;
	}
	@Override
	public String getTender_id() {
		return tender_id;
	}
	
	@Override
	public void setTender_id(String tender_id) {
		this.tender_id = tender_id;
	}
	
	@Override
	public String getTender_name() {
		return tender_name;
	}
	
	@Override
	public void setTender_name(String tender_name) {
		this.tender_name = tender_name;
	}
	
	@Override
	public LocalDate getTender_posted_date() {
		return tender_posted_date;
	}
	
	@Override
	public void setTender_posted_date(LocalDate tender_posted_date) {
		this.tender_posted_date = tender_posted_date;
	}
	
	@Override
	public LocalDate getTender_close_date() {
		return tender_close_date;
	}
	
	@Override
	public void setTender_close_date(LocalDate tender_close_date) {
		this.tender_close_date = tender_close_date;
	}
      
	
      
}
