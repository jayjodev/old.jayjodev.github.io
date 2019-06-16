/** BMI_Calculator2. java
 * author: Gangrae Jo
 * purpose: Develop a java application.
 */
package application;
import java.util.Scanner; //program uses class Scanner
import java.text.DecimalFormat; // set up decimal format

public class BMI_Calculator2 {

	private double _pound; // initialize global variable
	private double _feet; // initialize global variable

	public static void main(String[] args) {

		// Create a Scanner to obtain input from user
		DecimalFormat twoDForm = new DecimalFormat("#.00");
		System.out.println("This is BMI Calculator"); // introduction of Calculator
		double result =bmiFuntion(); //Get result using function.
		String interpertation = calculateBmiDescription(result);
		System.out.println("Your BMI is "+ twoDForm.format(result) + " and "+ "It is "+ interpertation); // introduction of Calculator
	}

	public static double bmiFuntion()
	{
		Scanner input = new Scanner(System.in);
		BMI_Calculator2 self = new BMI_Calculator2();
		double kg;
		double meter;
		double result;
		System.out.print("Enter your weight(pounds): "); //user input
		self._pound = input.nextDouble();
		System.out.print("Enter your height(feet): "); //user input
		self._feet = input.nextDouble();
		kg = self._pound *0.453;
		meter = self._feet * 0.304;
		result = kg / (meter * meter);
		input.close();

		return result;
	}

	static String calculateBmiDescription(double result)
	{
		String interpertation = "";

		if (result < 18.5)
		{
			interpertation ="Underweight";
		}

		else if (result > 18.5 && result < 24.9)
		{
			interpertation ="Normal";
		}

		else if (result > 25.0 && result < 29.9)
		{
			interpertation ="Overweight";
		}
		else
		{
			interpertation ="Obses";
		}
		return interpertation;
	}
}
