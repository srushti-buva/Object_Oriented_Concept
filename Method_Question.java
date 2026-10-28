package method_types;

public class Method_Question {
	
	//1.TYPE 1. No Argument ,No Return Value
	
	//1. Check Even or Odd
	public void checkEvenOdd() {
		int number = 10;
		if(number % 2 ==0) {
			System.out.println("Even Number");
		
		}else {
			System.out.println("Odd Number");
		}
	}
	
	
	//2.Print Number using the for loop
	public void PrintNumber() {
		for(int i = 1;i<= 10;i++) {
			System.out.println(i + " ");
		}
		System.out.println();
		
	}
	
	//3.Multiplication Table
	public void multiplication() {
		int number = 5;
		for(int i = 1;i<= 10;i++) {
			System.out.println(number + " X "+ i + " = "+(number * i));
		}
	}
	
	
	
	
	//Type 2 : Argument ,No return value
	
	//4.Check Positive or Negative
	public void checkNumber(int number) {
		if(number >0) {
			System.out.println("Positive Number");
		}else if(number < 0) {
			System.out.println("Negative Number");
		}else {
			System.out.println("Zero");
		}
	}
	
	
	
	//5. Find factorial
	public void factorial(int numbber) {
		 int number = 5;
		if(number < 0) {
			System.out.println("Factorial is not defined for negative numbers");
			return;
		}
		
		long fact = 1;
		for(int i = 1;i<= number;i++) {
			fact = fact * i;
		}
		System.out.println("Factorial: "+fact);
	}
	
	
	//Type 3 : No Argument,With Return Value
	
	
   //6.Return sum of two Numbers
	public int addition() {
		int a = 10;
		int b = 20;
		return a + b;
	}
	
	//7.Return square of a number
	public int square() {
		int number = 5;
		return number * number;
	}
	
	//8.Return a fixed Number
	public int getNumber() {
		return 100;
	}
	
	
	//Type 4 : Argument, With Return Value
	//10. Return maximum of two Numbers
	public int maximum(int a ,int b) {
		if(a>b) {
			return a ;
		}else {
			return b ;
		}
	}
	
	
	
	//11. Return sum of Numbers from 1 to n
	public int sum(int n) {
		int total = 0;
		for(int i = 1;i<=n;i++) {
			total = total + i;
		}
		return total;
	}
	
	
	//12.Return factorial
	public long calculateFactorial(int n) {
		if(n<0) {
			return -1;
		}
		long fact = 1;
		
		for(int i = 1;i<=n;i++) {
			fact = fact * i;
		}
		return fact;
	}
	
	
	
	// 13. Return Palindrome Result
	public boolean isPalindrome(int number) {

	    if (number < 0) {
	        return false;
	    }

	    int original = number;
	    int reverse = 0;

	    while (number > 0) {
	        int digit = number % 10;
	        reverse = reverse * 10 + digit;
	        number = number / 10;
	    }

	    return original == reverse;
	}
	
	
	//14. Return Area Of Rectangle
	public int area(int length,int breadth) {
		return length * breadth;
	}
	
			
			
		
	}
		
		
		
	
	
	
	
	
	


