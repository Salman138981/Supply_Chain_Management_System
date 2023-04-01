package com.masaischool.dao;

import java.util.List;

import com.masaischool.dto.Bids;
import com.masaischool.exception.NoRecordFoundException;
import com.masaischool.exception.SomethingWentWrongException;

public interface BidsDAO {
	 public List<Bids> getAllBidsByTender(String tender_id) throws SomethingWentWrongException, NoRecordFoundException;
}
