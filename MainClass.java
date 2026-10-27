package com.tka.bank;

public class MainClass {
	  public static void main(String[] args) {

	        Bank b1 = new Bank();

	        b1.accountHolder = "Srushti";
	        b1.accountNumber = 1234567890L;
	        b1.balance = 50000;
	        b1.bankName = "SBI";

	        b1.display();

	        System.out.println("----------------------");

	        Bank b2 = new Bank();

	        b2.accountHolder = "Priya";
	        b2.accountNumber = 9876543210L;
	        b2.balance = 75000;
	        b2.bankName = "HDFC";

	        b2.display();
	    }
	}


