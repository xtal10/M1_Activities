package Activity.M2_Activities.Exercise2;

public class Truck extends Vehicle implements Refuelable {
	
	public Truck(int i, String string) {
		// TODO Auto-generated constructor stub
		this.setBrand(string);
		this.setNumberOfWheels(i);
	}
	
	public Truck() {
		
	}
	

	public void refuel () {
		
		System.out.println("The engine "+this.getBrand()+ " has been refueled");
	}

	public void startEngine () {
		
		System.out.println("The Vehicle "+this.getBrand()+ " has been started");
	}

}
