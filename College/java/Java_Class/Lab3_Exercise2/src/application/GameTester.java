/**Lab3_Exercise3. java
 * author: Gangrae Jo
 * purpose: GameTester.
 */

package application;

public abstract class GameTester //Abstract class
{
	protected String _name; //Instance variable
	protected boolean _status; //Instance variable
	
	public GameTester(String name, boolean _status) //Constructor
	{
		this._name = name;
		this._status = _status;
	}
	public abstract double determine_salary(int hour); //Abstract method
}

	
