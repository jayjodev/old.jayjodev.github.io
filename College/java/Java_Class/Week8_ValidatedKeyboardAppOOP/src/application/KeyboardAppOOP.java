/**
 * author: Elmira Adeeb
 * purpose: Develop a Java Application used to move a robot
 *
 */


package application;
import java.util.InputMismatchException; // used to handle bad user input
import java.util.Scanner; // used for user input

// Declaration of the class KeyboardApplication
public class KeyboardAppOOP {
	/**represents the key entered by the user */
	private int _userKey= -1; // initialize the field to an invalid value

	// Declaration of the main method
	public static void main(String[] args) {
		// Declarations & Initializations

		Scanner input = new Scanner(System.in);
		KeyboardAppOOP self= new KeyboardAppOOP();
		do{ // repeat
			// INPUT
			try{
				System.out.print("Enter a key (1-9). Enter (0 to stop): ");
				self._userKey = input.nextInt();

				// Invoke the printMovement method
				// to print the move
				self.printMovement();
			}
			catch (InputMismatchException e){
				System.out.println("INVALID INPUT. MUST BE AN INTEGER");
				if (e.getMessage()!= null){
					System.out.println("More info :" + e.getMessage());
				}
				input.nextLine(); // discard the bad input
			}
			catch (Exception e){ // Note: this is not good practice
				                 //  When caught ending the application would be suggested
				System.out.println("Something went wrong, the application ends.");
				System.exit(1); // return 1 to show the erratic status of ending the
			}	                //  application

		}while(self._userKey != 0);// stop when user enters zero

		input.close();

	}// end of the main method

	/** printMovement method
	 * will print the movement according to the key entered by the user
	 * */
	public void printMovement(){

		switch(this._userKey)  // check for the value of userKey
		{
		case 0:
			System.out.println("You have entered zero. The application will end.");
			break;
		case 2:  // value 2
			System.out.println("Move Down.");
			break;
		case 4: // value 4
			System.out.println("Move Left.");
			break;
		case 8:  // value 8
			System.out.println("Move Up.");
			break;
		case 6: // value 6
			System.out.println("Move Right.");
			break;
		case 1: // value 1, 3, 7 and, 9
		case 3:
		case 7:
		case 9:
			System.out.println("Diagonal Movement is not allowed.");
			break;
		default: // anything else
			System.out.println("Invalid Key!");

		}



	}



}// end of class
