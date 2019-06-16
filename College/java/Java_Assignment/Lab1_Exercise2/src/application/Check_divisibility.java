/** Check_divisibility. java
 * author: Gangrae Jo
 * purpose: Develop a java application.
 */

package application;
import java.util.Scanner; //program uses class Scanner

public class Check_divisibility {

	private int _dividefive; // initialize global variable
	private int _dividesix; // initialize global variable

	public static void main(String[] args) {

		int userInput = userInput();
		checkDivisiblity(userInput);
	}

	public static int userInput()
	{
		int userInput;
		Scanner input = new Scanner(System.in);
		System.out.println("This application checks whether the number is divisible by 5 and 6");
		System.out.print("Input your number: ");
		userInput = input.nextInt();
		input.close();

		return userInput;
	}

	public static void checkDivisiblity(int userInput)
	{
		Check_divisibility self = new Check_divisibility();

		self._dividefive = userInput%5;
		self._dividesix = userInput%6;

		if (self._dividefive == 0 && self._dividesix == 0 )
		{
			System.out.print(userInput + " is divisible by both 5 and 6.");
		}
		else
		{
			if (self._dividefive != 0 && self._dividesix != 0 )
			{
				System.out.print(userInput + " is not divisible by either 5 or 6");
			}
			else if (self._dividefive == 0 || self._dividesix == 0 )
			{
				System.out.print(userInput + " is divisible by 5 or 6, but not both");
			}
		}
	}
}
