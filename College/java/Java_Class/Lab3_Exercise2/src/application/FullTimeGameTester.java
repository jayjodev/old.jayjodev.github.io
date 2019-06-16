/**Lab3_Exercise3. java
 * author: Gangrae Jo
 * purpose: GameTester.
 */

package application;

class FullTimeGameTester extends GameTester //inheritance from GameTester class
{
	public FullTimeGameTester(String name) //Constructor
	{
		super(name,true); //Calling the constructor from GameTester class
	}
	public double determine_salary(int hour) //Return the Full time salary 
	{
		return 3000.0;
	}
}
