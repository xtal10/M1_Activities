package Activity.M2_Activities.Exercise2;

public  abstract class Vehicle implements Refuelable {
		
		private int numberOfWheels ;
		private String brand;
		
	// getters and setters	
	public int getNumberOfWheels() {
		
		return numberOfWheels;
	}
	
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels=numberOfWheels;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void  setBrand(String brand) {
		this.brand=brand;
	}
	// abstract method
	abstract void startEngine();
	
	//
	public void destroy() {
		
		System.out.println("The vehicle "+brand+" with "+numberOfWheels+" wheels has been destroyed");
		
	}
}
