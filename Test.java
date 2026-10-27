package bbbb;

public class Test {
	public static void main(String[] args) {
		Country country = new Country();
		State state = country.getState();
		District district = state.getDistrict();
		City city = district.getCity();
		String village = city.getVillageName();
		System.out.println(village);
		
		
		
	}

}
