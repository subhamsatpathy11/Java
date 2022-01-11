import java.util.Arrays;
import java.util.Scanner;

public class Array_Search {
	
	public static void main(String[] args) {
		
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		
		System.out.println(Arrays.toString(arr));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to search in array : ");
		int n = scanner.nextInt();
		
		for(int i = 0; i< arr.length; i++)
		{
			if(arr[i] == n)
			{
				System.out.println(n + " is found in the array at " + i + "th index.");
			}
		}
	}
}
