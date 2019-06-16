/** Keyboard Application. java
 * author: Elmira Adeeb
 * purpose: Develop a java application to decide the movement
 *          using a method named printMovement
 */

package application;

import java.util.Scanner; // used to scan values

public class KeyboardAppV2 {
	public static void main(String[] args)
	{
		// Declarations & Initializations
		int userKey; // represents the key entered by the user
		Scanner input = new Scanner(System.in);
		KeyboardAppV2 self = new KeyboardAppV2();
		// INPUT
		System.out.print("Enter an integer value: ");
		userKey = input.nextInt();

		input.close();

		// Print movement
		self.printMovement(userKey);

	}// end of the main method

/** printMovement decides the movement based on the key
 * @param userKey : the key that the user enters
 */
	public void printMovement(int userKey){

		switch(userKey) // check the different values of the key
		{
		case 2:
			System.out.println("Move Down");
			break;
		case 4:
			System.out.println("Move Left");
			break;
		case 8:
			System.out.println("Move Up.");
			break;
		case 6:
			System.out.println("Move Right.");
			break;
		case 1:
		case 3:
		case 7:
		case 9:
			System.out.println("Diagonal Movement Not Allowed.");
			break;
		default:
			System.out.println("Invalid Key");
			break;

		}// end of the switch


	}


}// end of the class
