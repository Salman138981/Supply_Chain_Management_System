package com.masaischool.ui;

import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import com.masaischool.dao.BidsDAO;
import com.masaischool.dao.BidsDAOImpl;
import com.masaischool.dto.Bids;
import com.masaischool.exception.NoRecordFoundException;
import com.masaischool.exception.SomethingWentWrongException;

public class BidsUI {
     
	public static void viewBidsOfTender(Scanner sc) {
		  System.out.println("Please Enter Tender id");
		  String tender_id = sc.next();
		  
		  BidsDAO bDAO = new BidsDAOImpl();
		  try {
			  List<Bids> list = bDAO.getAllBidsByTender(tender_id);
			  
			  Consumer<Bids> bids = bid -> System.out.println("The bid id is "+ bid.getBidId()+" the bid amount is "+ bid.getBidAmount()+ " the bid status is "+ bid.getBidStatus()+
					  " the tender is "+ bid.getTender()+ " the vendor id is " + bid.getVender());
			  
			  list.forEach(bids);
		  }catch(SomethingWentWrongException | NoRecordFoundException ex) {
			  System.out.println(ex);
		  }
		  
	}
}
