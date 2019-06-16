/**Lab3_Exercise3. java
 * author: Gangrae Jo
 * purpose: Inheritance.
 */
package application;
import java.util.Scanner; //program uses class Scanner


public class Program {

	public static void main(String[] args) {

		String type; //variables
		Double fee;
		Double insurance;
		String end ="";
		int amount = 0;

		Insurance[] reference = new Insurance[10]; //Insurance object array
		Scanner input = new Scanner(System.in);

		while(!end.equalsIgnoreCase("Y")){ // Ask value from a user
			System.out.print("Enter of insurance: ");
			type = input.nextLine();
			System.out.print("Enter monthly fee: ");
			fee = input.nextDouble();
			type = type.toUpperCase();
			switch(type){

			case "HEALTH": //If user type health create health object
				Health h = new Health();
				h.set_typeofinsurance(type);
				h.set_monthlycost(fee);
				//h.displayInfo();
				reference[amount] = h;
				amount++;
			case "LIFE":  //If user type life create life object
				Life l = new Life();
				l.set_typeofinsurance(type);
				l.set_monthlycost(fee);
				reference[amount] = l;
				l.displayInfo();
				amount++;

			default: //Ask user go out the program
				System.out.print("Do you want to exit? (Y/N): ");
				end = input.next();
				input.nextLine();
				if(end.equalsIgnoreCase("Y")){
					break;
				}
			}

		}
		for (int i = 0; i < amount - 1;  i++) //Sending set insurance cost message to each object in array and displaying this information on the screen
		{
			System.out.print("Enter the Insurance Cost "+ i + " index: ");
			insurance = input.nextDouble();
			reference[i].setInsuranceCost(insurance);
			reference[i].displayInfo();
		}
		System.out.println("Thank you");
		input.close();

	}

}


