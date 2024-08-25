package asssignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class City{
	private String name;
	private int pincode;
	private String capital;
	public City(String name, int pincode,String capital) {
		this.name = name;
		this.pincode = pincode;
		this.capital = capital;
	}
	public void display() {
		System.out.println("Name is "+this.name);
		System.out.println("Pincode is "+this.pincode);
		System.out.println("Capital is "+this.capital);

	}
}
public class Day9Assignment {

	public static void main(String[] args) {
		List<City> cities = new ArrayList<City>();
		cities.add(new City("city1",1234,"capital1"));
		
		//enhanced for loop
				for(City cy:cities) {
					cy.display();
				}
				
		//normal for loop without iterator
				int ln = cities.size(); 
				
				for (int i=0;i<ln;i++) {
					cities.get(i).display();
				}
				
		
		//2 Take input data from keyboard
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter City Name : ");
		String cityName = sc.nextLine();
		
		System.out.println("Enter City Capital : ");

		String capital = sc.nextLine();
		
		System.out.println("Enter City pincode : ");
		int pincode = sc.nextInt();
		
		cities.add(new City(cityName,pincode,capital));

		//3 Take multiple inputs from keyboard 
		
				int totalCities = sc.nextInt();
				
				for (int i=0;i<=totalCities;i++) {
					System.out.println("Enter City Name : ");
					 cityName = sc.nextLine();
					
					System.out.println("Enter City Capital : ");

					 capital = sc.nextLine();
					
					System.out.println("Enter City pincode : ");

					 pincode = sc.nextInt();
					cities.add(new City(cityName,pincode,capital));
			
				}
				//4 a.Add City Objects in between
				City cityAdd = new City("City5",1234,"capital5");
			
				cities.add(cityAdd);
				
		//b. Remove City Object 
				
				cities.remove(cityAdd);

	}

}
