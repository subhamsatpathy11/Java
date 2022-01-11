import java.util.Scanner;

public class Login_User {

	public static void main(String[] args) {
		
		String name, password;
		int count = 0, itr, track = 0;
		
		while(count<3 && track == 0)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the login name : ");
			name = scanner.nextLine();
			System.out.println("Enter password : ");
			password = scanner.nextLine();
			
			if(name.equals("Subham") && password.equals("satpathy"))
			{
				track = 1;
				System.out.println("Welcome " + name);
			}
			else
			{
				count++;
				itr = 3-count;
				System.out.println("Try Again. Remaining attempts " + itr);
				
				if(itr == 0)
				{
					System.out.println("Contact Admin");
				}
			}	
		}
	}
}
