# Core Java | Assignment 1

1. Find out if the given number is an Armstrong number. Logic-if 153 is the Supplied value, then 1³+5^3+3^3=1+125+27=153.

```
import java.util.Scanner;
import java.lang.Math;

public class Armstrong {

	public static void main(String[] args) {
		
		int n, temp, rem, res = 0, i = 0;
		
		System.out.println("Enter the number: ");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		
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
		else
		{
			System.out.println(n + " is not an ArmStrong number.");
		}
	}
}
```
