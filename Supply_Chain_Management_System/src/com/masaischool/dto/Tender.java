package com.masaischool.dto;

import java.time.LocalDate;

public interface Tender {
	public String getTender_id();
	public void setTender_id(String tender_id);
	public String getTender_name();
	public void setTender_name(String tender_name);
	public LocalDate getTender_posted_date();
	public void setTender_posted_date(LocalDate tender_posted_date);
	public LocalDate getTender_close_date();
	public void setTender_close_date(LocalDate tender_close_date);
}
