package Activity.M2_Activities.Exercise2;

public class Car extends Vehicle implements Refuelable {
	
	
	
	
	
	
	



public Car(int i, String string) {
		// TODO Auto-generated constructor stub
	this.setBrand(string);
	this.setNumberOfWheels(i);
	
	}

public Car() {
	// TODO Auto-generated constructor stub
}
public void refuel () {
	
	System.out.println("The engine "+this.getBrand()+ " has been refueled");
}

public void startEngine () {
	
	System.out.println("The Vehicle "+this.getBrand()+ " has been started");
}

}


