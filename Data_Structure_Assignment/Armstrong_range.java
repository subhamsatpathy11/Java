import java.util.Scanner;
import java.lang.Math;

public class Armstrong_range {

	public static void main(String[] args) {
		
		//condiser a loop to initiate the range of numbers
		
		for(int n = 100; n < 1000; n++)
		{
			int temp, rem, res = 0, i = 0;
			
			
			temp = n;
			
			for(; temp!= 0; temp/= 10)
			{
				i++;
			}
			temp = n;
			
			for(; temp!= 0; temp/= 10)
			{
				rem = temp % 10;
				res += Math.pow(rem, i);
			}
			
			if(res == n)
			{
				System.out.println(n + " is an ArmStrong number.");
			}
		}

	}

}
