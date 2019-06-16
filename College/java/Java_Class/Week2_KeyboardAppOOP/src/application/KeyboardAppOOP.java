/** Keyboard Application. java
 * author: Elmira Adeeb
 * purpose: Develop a an Object Oriented java app to decide the movement
 *          using a method named printMovement.
 */

package application;

import java.util.Scanner; // used to scan values

public class KeyboardAppOOP {

	private int _userKey;

	public static void main(String[] args)
	{
		// Declarations & Initializations

		Scanner input = new Scanner(System.in);
		KeyboardAppOOP self = new KeyboardAppOOP();
		do{ //repeat
			// INPUT
			System.out.print("Enter an integer value (1 - 9). 0 to stop: ");
			self._userKey = input.nextInt();

			input.close();

			// Print movement
			self.printMovement();
		}while(self._userKey != 0);// as long key is not zero

	}// end of the main method

	/** printMovement decides the movement based on the key
	 * @param userKey : the key that the user enters
	 */
	public void printMovement(){

		switch(this._userKey) // check the different values of the key
		{
		case 0:
			System.out.println("You've entered zero. Application will end.");
			break;
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
