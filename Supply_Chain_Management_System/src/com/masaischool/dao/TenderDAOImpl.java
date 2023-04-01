package com.masaischool.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masaischool.dto.Tender;
import com.masaischool.dto.TenderImpl;
import com.masaischool.exception.NoRecordFoundException;
import com.masaischool.exception.SomethingWentWrongException;

public class TenderDAOImpl implements TenderDAO{ 
	
	@Override
	public void addTender(Tender tender) throws SomethingWentWrongException {
	  Connection conn = null;
	  
	  try {
		  conn = DBUtils.getConnectionTodatabase(); 
		  
		  String query ="INSERT INTO tender (tender_id, tender_name, tender_posted_date, tender_close_date) VALUES(?,?,?,?)";
		  
		  PreparedStatement ps = conn.prepareStatement(query);
		  ps.setString(1, tender.getTender_id());
		  ps.setString(2, tender.getTender_name());
		  ps.setDate(3, Date.valueOf(tender.getTender_posted_date()));
		  ps.setDate(4, Date.valueOf(tender.getTender_close_date()));
		  ps.executeUpdate();
		  
	  }catch(ClassNotFoundException | SQLException e) {
	    
	   throw new SomethingWentWrongException("Unable to insert the recond now, try again later");
		  
	  }finally {
		  try {
			  DBUtils.closeConnection(conn);
		  }catch(SQLException ex){
			  System.out.println(ex);
		  }
	  }
	}
	
	public List<Tender> getAllTender() throws SomethingWentWrongException, NoRecordFoundException{
		   Connection conn = null;
		   List<Tender> list = new ArrayList<>();
		   try {
			   conn = DBUtils.getConnectionTodatabase();
			   String query = "SELECT tender_id, tender_name, tender_posted_date, tender_close_date from tender";
			   PreparedStatement ps = conn.prepareStatement(query);
			   
			   ResultSet rs = ps.executeQuery();
			   
			   if(DBUtils.isResultSetEmpty(rs)) {
				   throw new NoRecordFoundException("No tender found");
			   }
			   
			   while(rs.next()) {
				   list.add(new TenderImpl(rs.getString(1),rs.getString(2),rs.getDate(3).toLocalDate(),rs.getDate(4).toLocalDate()));
			   }
		   }
		   catch(ClassNotFoundException | SQLException ex) {
		      throw new SomethingWentWrongException("Unable to display tender, try again later");
			   
		   }
		   finally {
			     try {
			    	 DBUtils.closeConnection(conn);
			     }catch(SQLException ex) {
			    	 
			     }
			   
		   }
		   return list;
	}
 
}
