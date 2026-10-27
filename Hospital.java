package com.tka.hospital;

public class Hospital {
	 String hospitalName;
	    String location;
	    int totalDoctors;
	    int totalBeds;
	    String department;

	    public static void emergency() {
	        System.out.println("Emergency Service Available");
	    }

	    public static void ambulance() {
	        System.out.println("Ambulance Service Available");
	    }

	    public static void pharmacy() {
	        System.out.println("Pharmacy Service Available");
	    }

	    public void display() {

	        System.out.println("Hospital Name --> " + hospitalName);
	        System.out.println("Location --> " + location);
	        System.out.println("Total Doctors --> " + totalDoctors);
	        System.out.println("Total Beds --> " + totalBeds);
	        System.out.println("Department --> " + department);

	        emergency();
	        ambulance();
	        pharmacy();
	    }

}
