package asssignment1;

class Vehicle{
	String name;
	
	public  Vehicle (String name) {
		this.name = name;
	}
	
}

class Car extends Vehicle{

	public Car(String name) {
		super(name);
	}
	
}

class Bus extends Vehicle{
	
	public Bus(String name) {
		super ( name);
	}
}

public class VehicleArray {

	public static void main(String[] args) {
		Vehicle [] vh  = new Vehicle [3];
		
		vh[0] = new Vehicle("Bike");
		vh[1] = new Car("Audi");
		vh[2] = new Bus("Benz");
		
		
	}

}
