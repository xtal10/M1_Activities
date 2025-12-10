package Activity.M2_Activities.Exercise2;

public class M2_Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle car = new Car(4,"Honda");
		
		Vehicle truck = new Truck(8,"Foton");
		
		car.startEngine();
		truck.startEngine();
		
		car.refuel();
		truck.refuel();
		
		destroyVehicle(car);
		destroyVehicle(truck);
		
	
			
			
			
	
}
	private static void destroyVehicle(Vehicle destroyVehicle) {
		
		destroyVehicle.destroy();
		
	
	}


}
