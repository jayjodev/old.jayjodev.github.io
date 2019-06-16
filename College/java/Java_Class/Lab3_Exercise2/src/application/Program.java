/**Lab3_Exercise3. java
 * author: Gangrae Jo
 * purpose: GameTester.
 */
package application;

import java.util.Scanner;

public class Program{

	public static void main(String[] args){

		int userInput;
		String name;
		int hours= 0;

		Scanner input = new Scanner(System.in); // Represent user input

		System.out.println("This is Game Tester");
		System.out.print("Select which player do you want (Full-time or Part-time):\nEnter the value Full-time(1), Part-time(2) : ");
		userInput = input.nextInt(); //Get information about status

		if (userInput == 1)
		{
			input.nextLine();
			System.out.print("Enter your name: ");
			name = input.nextLine(); //Get user name
			FullTimeGameTester Fulltime = new FullTimeGameTester(name); //Create Full-time Game tester object
			System.out.print("your name is " + Fulltime._name + ", Full-time Salary is " + Fulltime.determine_salary(hours)); //Determine the salary
		}

		else if (userInput == 2)
		{
			input.nextLine();
			System.out.print("Enter your name: ");
			name = input.nextLine(); //Get user name
			PartTimeGameTester Parttime = new PartTimeGameTester(name);  //Create Part-time Game tester object
			System.out.print("Enter the number of hours: ");
			hours = input.nextInt(); //Get hours to work
			System.out.println("your name is " + Parttime._name + ", Part-time Salary is " + Parttime.determine_salary(hours)); //Determine the salary
		}
		else
		{
			System.out.print("Please enter 1 or 2"); //Error input
		}
		input.close();

	}
}
