package application;

import java.util.ArrayList; // import ArrayList
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.Scanner;


public class AccountTest // AccountTest class to Test multiple transactions
{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		AccountInfo a1 = new AccountInfo("Gangrae Jo"); // Setup information of user
		AccountInfo a2 = new AccountInfo("Franndy Abreu");  // Setup information of user
		AccountInfo a3 = new AccountInfo("Elmira Adeeb"); // Setup information of user

		ArrayList <Transaction> userInfo = new ArrayList <Transaction>(); // ArrayList to create a list of three objects.

		userInfo.add(new Transaction(a1, 300948013)); // First user information
		userInfo.add(new Transaction(a2, 220230444)); // Second user information
		userInfo.add(new Transaction(a3, 232321344)); // Third user information

		System.out.println( "Creating threads" );

		// create each thread with a new targeted runnable

		ExecutorService threadExecutor = Executors.newCachedThreadPool();
		Scanner input = new Scanner(System.in);
		System.out.print("Choose the user of application Gangrae Jo(1), Franndy Abreu(2), Elmira Adeeb(3): ");
		int user = input.nextInt();

		if (user == 1) //If a user will choose Gangrae Jo, threadExecutor will execute with ArrayList 0.
		{
			threadExecutor.execute(userInfo.get(0)); //Execute of ExecutorService to execute the thread + Array List 0

		}
		else if (user == 2) //If a user will choose Franndy Abreu, threadExecutor will execute with ArrayList 1.
		{
			threadExecutor.execute(userInfo.get(1)); //Execute of ExecutorService to execute the thread

		}
		else if (user == 3) //If a user will choose Elmira Adeeb, threadExecutor will execute with ArrayList 1.
		{
			threadExecutor.execute(userInfo.get(2)); //Execute of ExecutorService to execute the thread
		}
		else
		{
			System.out.println("Please enter the number of users: Gangrae Jo(1), Franndy Abreu(2), Elmira Adeeb(3)");

		}
	}
}
