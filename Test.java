package aaaa;

public class Test {
	public static void main(String[] args) {
		Person person = new Person();
		Demographic gg = person.getDetails(23,"ddd");
		Location ll = gg.giveAddress();
		String ttt = ll.getCityName();
		System.out.println(ttt);
		
	
		
		
	}

}
