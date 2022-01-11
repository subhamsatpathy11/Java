import java.util.Scanner;

public class Condition_Class {

	public static void main(String[] args) {
		
		double sub1, sub2, sub3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter marks in subject 1: ");
		sub1 = scanner.nextDouble();
		System.out.println("Enter marks in subject 2: ");
		sub2 = scanner.nextDouble();
		System.out.println("Enter marks in subject 3: ");
		sub3 = scanner.nextDouble();
		
		if(sub1 > 60 && sub2 > 60 && sub3 > 60)
		{
			System.out.println("Passed");
		}
		else if((sub1 >60 && sub2 >60) || (sub2 >60 && sub3 >60) || (sub1 >60 && sub3 >60))
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
