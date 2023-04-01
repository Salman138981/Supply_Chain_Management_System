package com.masaischool.dao;

import java.util.List;

import com.masaischool.dto.Tender;
import com.masaischool.exception.NoRecordFoundException;
import com.masaischool.exception.SomethingWentWrongException;

public interface TenderDAO {
	public void addTender(Tender tender) throws SomethingWentWrongException;
	public List<Tender> getAllTender() throws SomethingWentWrongException, NoRecordFoundException;
	
	
}
