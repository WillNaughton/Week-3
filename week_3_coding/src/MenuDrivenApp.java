import java.util.Scanner;

import javax.swing.Timer;



public class MenuDrivenApp {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int imput = 0;
		String user = "USER";
		String car = "CAR";
		
		while(imput != -1) {
			System.out.println("Welcome " + user);
			System.out.println("Pick an option: ");
			System.out.println("1) Create Name");
			System.out.println("2) Fortune");
			System.out.println("3) Random Fact");
			System.out.println("4) Enter Favorite Car");
			System.out.println("-1) Exit");
			
			imput = sc.nextInt();
			
			if(imput == 1) {
			
				user = answer1();

			}
			if(imput == 2) {
				
			answer2();
			}
			if(imput == 3) {
				answer3();
			}
			if(imput == 4) {
				car = answer4();
				if (car.equals( "SlingShot")) {
			 System.out.println("Cool Car Bro!!");
				 }
			}
			}
		}
	
	public static String answer1() {
		System.out.println("Enter User Name: ");
		return sc.next();	
	}
	public static void answer2() {
		System.out.println("A hunch is creativity trying to tell you something.");	
	}
	public static void answer3() {				
		System.out.println("If you have 3 quarters, 4 dimes, and 4 pennies, you have $1.19. You also have the largest amount of money in coins without being able to make change for a dollar.");
}
	public static String answer4() {
		System.out.println("Enter Favorite Car: ");
		return sc.next();
		 
	}
	public static void answerdf1() {}
	public static void answedfsadfsdfr1() {}

}
