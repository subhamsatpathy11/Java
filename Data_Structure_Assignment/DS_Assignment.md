# Core Java | Assignment 1

1. Find out if the given number is an Armstrong number. Logic-if 153 is the Supplied value, then 1³+5^3+3^3=1+125+27=153.

 - This is the same as supplied value hence it is an Armstrong number.

```java
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

Output:

```
Enter the number: 
153
153 is an ArmStrong number.
```

2. Find out all the Armstrong numbers falling in the range of 100-999

```
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
```

Output:

```
153 is an ArmStrong number.
370 is an ArmStrong number.
371 is an ArmStrong number.
407 is an ArmStrong number.
```

3. Find out the simple as well as the compound interest of supplied

```
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

```

Output:

```
Enter the amount : 
10000
Enter the rate : 
7
Enter no. of years : 
12
Simple Interest : 8400.0
compound Interest : 12521.915889608248
```

4. Supply marks of three subject and declare the result, result declaration is based on below conditions:

 - Condition 1: All subjects marks is greater than 60 is Passed
 - Condition 2: Any two subjects marks are greater than 60 is Promoted
 - Condition 3: Any one subject mark is greater than 60 or all subjects marks less than 60 is failed

```
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
```

Output:

```
Enter marks in subject 1: 
76
Enter marks in subject 2: 
11
Enter marks in subject 3: 
13
Failed
```

5. Calculate the income tax on the basis of following table.

 - Note:-Assume slab is consider for Male, Female as well as Senior citizen
 
 | Slab | Income range | Tax Payable in percent |
 |------|--------------|------------------------|
 | Slab A | 0 - 1,80,000 | Nil |
 | Slab B | 1,80,001 - 3,00,000 | 10% |
 | Slab C | 3,00,001 - 5,00,000 | 20% |
 | Slab D | 5,00,001 - 10,00,000 | 30% |
 
 - Accept CTC from user and display tax amount
 
 ```
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
 ```
 
 Output:
 
 ```
Enter income : 
400000
Income tax payable is : 80000.0
 ```

6. 
 
