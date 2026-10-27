package com.tka.employee;

public class MainClass {
	 int empId;
	    String empName;
	    String department;
	    double salary;

	    public void work() {
	        System.out.println("Employee is working");
	    }

	    public void attendMeeting() {
	        System.out.println("Employee is attending meeting");
	    }

	    public void display() {
	        System.out.println("Employee ID --> " + empId);
	        System.out.println("Employee Name --> " + empName);
	        System.out.println("Department --> " + department);
	        System.out.println("Salary --> " + salary);

	        work();
	        attendMeeting();
	    }

}
