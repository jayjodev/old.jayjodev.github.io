/**Lab3_Exercise3. java
 * author: Gangrae Jo
 * purpose: GameTester.
 */

package application;

public class PartTimeGameTester extends GameTester //Inheritance from GameTester class
{
	public PartTimeGameTester(String name){ //Constructor
		
		super(name,false); //Calling the constructor from GameTester class
	}
	public double determine_salary(int hour){ //Return the Part time salary with hour
		
		return hour*20.0;
	}
}
