package com.masaischool.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masaischool.dto.Bids;
import com.masaischool.dto.BidsImpl;
import com.masaischool.dto.TenderImpl;
import com.masaischool.dto.VendorImpl;
import com.masaischool.exception.NoRecordFoundException;
import com.masaischool.exception.SomethingWentWrongException;

public class BidsDAOImpl implements BidsDAO{
     public  List<Bids> getAllBidsByTender(String tender_id) throws SomethingWentWrongException, NoRecordFoundException{
    	   
    	 Connection conn = null;
    	 List<Bids> list = new ArrayList<>();
    	 try {
    		 conn = DBUtils.getConnectionTodatabase();
    		 String query ="SELECT bid_id, bid_amount, bid_status, vendor_id " +
                     "FROM bids " +
                     "WHERE tender_id = ?";
    		 
    		 PreparedStatement ps = conn.prepareStatement(query);
    		  ps.setString(1, tender_id);
    		  
    		  ResultSet rs = ps.executeQuery();
    		  
    		  if(DBUtils.isResultSetEmpty(rs)) {
    			  throw new NoRecordFoundException("No Bids found");
    		  }
    		  
    		  while(rs.next()) {
    			  list.add(new BidsImpl(rs.getString(1),rs.getInt(2), rs.getString(3), new TenderImpl(rs.getString(4),null,null,null),new VendorImpl(rs.getString(5),null,null)));
    		  }
    		  
    		 
    	 }catch(ClassNotFoundException | SQLException ex) {
    		 throw new SomethingWentWrongException("unable to Display the Bids, Try again later");
    	 }
    	 finally {
    		 try {
    			 DBUtils.closeConnection(conn); 
    		 }catch(SQLException e) {
    			 throw new SomethingWentWrongException("");
    		 }
    	 }
    	 return list;
     }
}
