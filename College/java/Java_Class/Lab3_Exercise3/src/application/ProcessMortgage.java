/**Lab3_Exercise3. java
 * author: Gangrae Jo
 * purpose: CityToronto bank program.
 */

package application;
import java.util.Scanner;

public class ProcessMortgage {

	public static void main(String[] args) {

		Mortgage[] mortgages = new Mortgage[3]; //Set an array of 3 mortgages

		int userInput;
		int mortgage_number;
		String customer_name;
		double amountofmortgage;
		double interest_rate;
		int term;

		Scanner input=new Scanner(System.in); //Set scanner

		for(int i = 0; i < 3; i++) //User should input their data 3 times to get result
		{
			System.out.print("Choose Mortgage (Personal mortgage 1, Business Mortage 2): ");
			userInput=input.nextInt();

			if (userInput == 1)
			{
				System.out.print("Enter mortgage number:");
				mortgage_number=input.nextInt(); // Get info: personal mortgages number
				System.out.print("Enter customer name:");
				customer_name=input.next(); // Get info: personal mortgages customer name
				System.out.print("Enter amount of mortgage:");
				amountofmortgage=input.nextDouble(); // Get info: personal mortgages amount of mortgage
				System.out.print("Enter interest Rate:");
				interest_rate=input.nextDouble(); // Get info: personal mortgages interest rate
				System.out.print("Enter term:");
				term=input.nextInt();
				Mortgage Personal=new PersonalMortgage(mortgage_number,customer_name,amountofmortgage,interest_rate,term); //set all information using constructor
				mortgages[i]=Personal; //Store the created Mortgage objects in the array (Personal)
				input.close();

			}

			else if (userInput == 2)
			{
				System.out.print("Enter mortgage number:");
				mortgage_number=input.nextInt(); // Get info: personal mortgages number
				System.out.print("Enter customer name:");
				customer_name=input.next(); // Get info: personal mortgages customer name
				System.out.print("Enter amount of mortgage:");
				amountofmortgage=input.nextDouble(); // Get info: personal mortgages amount of mortgage
				System.out.print("Enter interest Rate:");
				interest_rate=input.nextDouble(); // Get info: personal mortgages interest rate
				System.out.print("Enter term:");
				term=input.nextInt();
				Mortgage Business=new PersonalMortgage(mortgage_number,customer_name,amountofmortgage,interest_rate,term); //set all information using constructor
				mortgages[i]=Business; //Store the created Mortgage objects in the array (Business)
			}
			else
			{
				System.out.print("Please enter 1 or 2"); //Error input
			}
		}

		for(int i = 0; i < 3; i++) //Data print (3 times)
		{
			System.out.println(mortgages[i].toString()); //Print all the information
		}
	}
}

