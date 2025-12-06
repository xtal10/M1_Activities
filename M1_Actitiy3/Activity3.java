package Activity.M1_Actitiy3;
import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integers:");
		int num1 = input.nextInt();
		System.out.print("Enter second integers:");
		int num2 = input.nextInt();
		
		int sum=num1+num2;
		int dif=num1-num2;
		int prod= num1*num2;
		System.out.println("Sum : "+sum);
		System.out.println("Difference : "+dif);
		System.out.println("Product : "+prod);
		
	}

}
