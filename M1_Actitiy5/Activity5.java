package Activity.M1_Actitiy5;
import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1=1;
		int sum=0;
		
		for (int i=num1; i<=50 ; i++) 
		{
			sum=sum+(num1*i);
		}
		
		System.out.println("Sum=: "+sum);

	}

}
