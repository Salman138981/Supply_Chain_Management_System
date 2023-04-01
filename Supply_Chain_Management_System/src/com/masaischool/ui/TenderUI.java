package com.masaischool.ui;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

import com.masaischool.dao.TenderDAO;
import com.masaischool.dao.TenderDAOImpl;
import com.masaischool.dto.Tender;
import com.masaischool.dto.TenderImpl;
import com.masaischool.exception.NoRecordFoundException;
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
	
	public static void viewAllTenders() {
		 
		TenderDAO tenDAO = new TenderDAOImpl();
		try {
			List<Tender> ten = tenDAO.getAllTender();
			Consumer<Tender> con = tender -> System.out.println("Tender id "+ tender.getTender_id()+" Tender_name "+ tender.getTender_name()
			+" Tender posted date "+ tender.getTender_posted_date()+ " Tender close date " + tender.getTender_close_date());
			
			ten.forEach(con);
					
		}catch(SomethingWentWrongException | NoRecordFoundException e) {
			System.out.println(e.getMessage());
			
		}
	}
}
