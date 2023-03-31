package com.masaischool.dao;

import com.masaischool.dto.Tender;
import com.masaischool.exception.SomethingWentWrongException;

public interface TenderDAO {
	public void addTender(Tender tender) throws SomethingWentWrongException;
	
	
}
