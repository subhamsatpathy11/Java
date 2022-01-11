import java.util.Scanner;

public class Income_Tax {

	public static void main(String[] args) {
		
		double tax =  0, CTC;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter income : ");
		CTC = scanner.nextDouble();
		
		if(CTC <= 180000)
		{
			tax = 0;
		}
		else if(CTC > 180000 && CTC <= 300000)
		{
			tax = (CTC/100)*10;
			System.out.println("Income tax payable is : " + tax);
		}
		else if(CTC > 300000 && CTC <= 500000)
		{
			tax = (CTC/100)*20;
			System.out.println("Income tax payable is : " + tax);
		}
		else if(CTC > 500000 && CTC <= 1000000)
		{
			tax = (CTC/100)*30;
			System.out.println("Income tax payable is : " + tax);
		}	
	}
}
