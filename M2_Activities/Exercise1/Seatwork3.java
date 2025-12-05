package Activity1.M2_Activities.Exercise1;

public class Seatwork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Default constructor
		Car cr= new Car();
		
		cr.setBrandName("Honda");
		cr.setModelName("Civic type R");
		cr.setColor("Blue");
		
		
		cr.displayInfo();
		
		//Constructor with param
		Car car2 = new Car("Toyota","Vios","Red");
		
		car2.displayInfo();
		
		
		
		
		
		//String brandName=cr.get;
		
		//constructor with param
		//cr.car1info(50000,"Red","BMW","330i xDrive Gran Turismo");
		//cr.car2info();

	}

}
