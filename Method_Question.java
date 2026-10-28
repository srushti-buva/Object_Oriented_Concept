package method_overloading;

public class Method_Question {
	//1. Even or Odd
	public void show(int n ) {
		if(n % 2 ==0) {
			System.out.println(n + "Is Even");
		}else {
			System.out.println(n + "Is odd");
		}
	}
	
	//2. Posotive ,Negative ,Zero
	public void show(double n) {
		if(n >  0) {
			System.out.println(n + "is Positive");
		}else if(n <0){
			System.out.println(n + "is Negative");
		}else {
			System.out.println("Number is zero");
		}
	}
	
	//3. Print number using for loop
	public void show(int start, int end) {
		for(int i = start ;i<= end;i++) {
			System.out.println(i + " ");
		}
		System.out.println();
	}
	
	//4. Multiplication table 
	public void show(int n ,int limit , int choice) {
		if(choice == 1) {
			for(int i = 1;i<= limit;i++) {
			System.out.println(n + "x" + i + " = " +(n*i));
		}
	 }else {
		System.out.println("Invalid choice");
	}
	
	}
	
	//5.Reverse Number using while loop
	public void show(long n) {
		long reverse = 0;
		long temp = Math.abs(n);
		while(temp > 0) {
			long digit = temp % 10;
			reverse = reverse * 10 + digit;
			temp = temp / 10;
		}
		if(n < 0) {
			reverse = -reverse;
			
		}
		System.out.println("Reverse: "+ reverse);
	}

}
