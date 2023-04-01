package com.masaischool.ui;

import java.util.Scanner;

public class UIMain {
	
	static void displayAdminMenu() {
		System.out.println("1. Add new tender");
		System.out.println("2. view all tenders");
		System.out.println("3. view all the bids of a tender");
	}
	
	static void adminMenu(Scanner sc) {
		int choice = 0;
		do {
			displayAdminMenu();
			System.out.println("Enter Selection");
			choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				System.out.println("Bye bye Admin");
				break;
			case 1:
				TenderUI.addNewTender(sc);
				break;
			case 2: 
				TenderUI.viewAllTenders();
				break;
			case 3:
				BidsUI.viewBidsOfTender(sc);
				break;
			}
		
				
		}while(choice!=0);
	}
	
	static void adminLogin(Scanner sc) {
		System.out.println("Enter Username ");
		String username = sc.next();
		System.out.println("Enter username");
		String password = sc.next();
		
		if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
			adminMenu(sc);
		}else {
			System.out.println("Invalid username and Password");
		}
		
	}

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		  int choice = 0;
		  do {
			  System.out.println("1. Admin Login\n2. Customer Login\n0. Exit");
				choice = sc.nextInt();
				switch(choice) {
					case 0:
						System.out.println("Thank you, Visit again");
						break;
					case 1:
						adminLogin(sc);
						break;
					case 2: 
						//customerLogin(sc);
						break;
					default:
						System.out.println("Invalid Selection, try again");
				}
			  
			  
		  }while(choice!=0);
		 sc.close();

	}

}
