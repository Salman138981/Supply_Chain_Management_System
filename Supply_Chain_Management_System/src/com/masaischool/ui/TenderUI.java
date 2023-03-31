package com.masaischool.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.masaischool.dao.TenderDAO;
import com.masaischool.dao.TenderDAOImpl;
import com.masaischool.dto.Tender;
import com.masaischool.dto.TenderImpl;
import com.masaischool.exception.SomethingWentWrongException;

public class TenderUI {

	public static void addNewTender(Scanner sc) {
		 System.out.println("Enter tender id");
		 String tender_id = sc.next();
		 System.out.println("Enter tender name");
		 String tender_name = sc.next();
		 System.out.println("Enter tender posted date");
		 LocalDate tender_posted_date= LocalDate.parse(sc.next()); 
		 System.out.println("Enter tender close date");
		 LocalDate tender_close_date = LocalDate.parse(sc.next());
		 
		 Tender tDTO = new TenderImpl(tender_id,tender_name,tender_posted_date,tender_close_date);
		 
		 TenderDAO tDAO = new TenderDAOImpl();
		 
		 try {
			tDAO.addTender(tDTO);
		} catch (SomethingWentWrongException e) {
			 System.out.println(e);
		}
		 
		
	}
}
