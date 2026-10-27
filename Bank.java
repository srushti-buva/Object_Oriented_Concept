package com.tka.bank;

public class Bank {
	 String accountHolder;
	    long accountNumber;
	    double balance;
	    String bankName;

	    public void deposit() {
	        System.out.println("Amount deposited successfully");
	    }

	    public void withdraw() {
	        System.out.println("Amount withdrawn successfully");
	    }

	    public void display() {
	        System.out.println("Account Holder --> " + accountHolder);
	        System.out.println("Account Number --> " + accountNumber);
	        System.out.println("Balance --> " + balance);
	        System.out.println("Bank Name --> " + bankName);

	        deposit();
	        withdraw();
	    }

}
