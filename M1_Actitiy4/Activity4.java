package Activity.M1_Actitiy4;
import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your age: ");
		int num1=input.nextInt();
		
			if(num1<18) {
				
				System.out.print("Minor");
				
						}
			else if (num1>18 && num1<60) {
				

				System.out.print("Adult");
			}
			else {
				System.out.print("Senior");
			}
				}

}

