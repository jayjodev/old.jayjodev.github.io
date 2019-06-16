/**Lab2_Exercise3. java
 * author: Gangrae Jo
 * purpose: Practice Overloaded Method(static).
 */

package application;
import java.text.DecimalFormat; // set up decimal format

public class Overloaded_Method {

	public static void main(String[] args)
	{
		DecimalFormat twoDForm = new DecimalFormat("#.00"); //Decimal Format is .00;
		Overloaded_Method self =new Overloaded_Method();
		self.about_program(); //About this program

		double radius = 6.7; //Set up data (Unit: meter)
		double height = 440; //Set up data (Unit: meter)
		double pi = 3.14;
		double density = 7.7;
		int numberOfsteel = 5;

		System.out.println("Volume of Steel bar(1) is: " + twoDForm.format(Overloaded_Method.steel(radius, pi, height)) + "m3"); //  Call the three methods in main
		System.out.println("Weight of Steel bar(1) is: " + twoDForm.format(Overloaded_Method.steel(radius, pi, height, density)) + "kg");
		System.out.println("Total Weight of Steel bar is: " + twoDForm.format(Overloaded_Method.steel(radius, pi, height, density,numberOfsteel)) + "kg");
	}

	public static double steel(double radius, double pi, double height) // three overloaded static methods
	{
		return radius * radius * pi * height;
	}
	public static double steel(double radius, double pi, double height, double density)
	{
		return density*radius *radius *pi*height ;
	}
	public static double steel(double radius, double pi, double height, double density, int numberOfsteel)
	{
		return density*radius *radius *pi*height*numberOfsteel;
	}

	public void about_program()
	{
		System.out.println("# Desity of pure iron is about 7.7g/cm^3");
		System.out.println("=======================================");
		System.out.println("Weight, volume of a Steel bar ");
	}
}
