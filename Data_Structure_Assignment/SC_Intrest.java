import java.util.Scanner;
import java.lang.Math;

public class SC_Intrest {
	
	public static void main(String[] args) {
	
		double rate, amount, years, simple, compound;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the amount : ");
		amount = scanner.nextDouble();
		System.out.println("Enter the rate : ");
		rate = scanner.nextDouble();
		System.out.println("Enter no. of years : ");
		years = scanner.nextDouble();
		
		simple = (rate * years * amount)/ 100;
		compound = amount * Math.pow(1 + rate/100, years) - amount;
		
		System.out.println("Simple Interest : "+simple);
		System.out.println("compound Interest : "+compound);
		
	}
}
