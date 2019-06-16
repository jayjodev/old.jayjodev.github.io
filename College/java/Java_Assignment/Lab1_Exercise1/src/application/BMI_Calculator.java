/** BMI_Calculator. java
 * author: Gangrae Jo
 * purpose: Develop a java application1.
 */
package application;
import java.util.Scanner; //program uses class Scanner
import java.text.DecimalFormat; // set up decimal format

public class BMI_Calculator {

	private double _pound; // initialize global variable
	private double _feet; // initialize global variable

	public static void main(String[] args) {
		// Create a Scanner to obtain input from user
		DecimalFormat twoDForm = new DecimalFormat("#.00");
		System.out.println("This is BMI Calculator"); // introduction of Calculator
		double result =bmiFuntion(); //Get result using function.
		System.out.printf("Your BMI is : "+ twoDForm.format(result) ); // Print Result.
	}

	public static double bmiFuntion()
	{
		Scanner input = new Scanner(System.in);
		BMI_Calculator self = new BMI_Calculator();
		double kg;
		double meter;
		double result;
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.version"));
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

}