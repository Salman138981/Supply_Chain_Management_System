package com.masaischool.dao;

import java.sql.Connection;

import com.masaischool.dto.Tender;
import com.masaischool.exception.SomethingWentWrongException;

public class TenderDAOImpl implements TenderDAO{ 
	
	@Override
	public void addTender(Tender tender) throws SomethingWentWrongException {
	  Connection conn = null;
	}

}
