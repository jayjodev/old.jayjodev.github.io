/**Lab3_Exercise3. java
 * author: Gangrae Jo
 * purpose: Inheritance.
 */
package application;

public abstract class Insurance { //abstract class

	protected String _typeofinsurance; //instance variable
	protected double _monthlycost; //instance variable


	public void set_typeofinsurance(String _typeofinsurance) { // set insurance type
		this._typeofinsurance = _typeofinsurance;
	}

	public double get_monthlycost() {  // get monthly cost
		return _monthlycost;
	}

	public void set_monthlycost(double _monthlycost) {  // set insurance cost
		this._monthlycost = _monthlycost;
	}

	public String getType() { // get insurance type
		return _typeofinsurance;
	}

	public abstract void setInsuranceCost(double cost); // abstract method
	public abstract void displayInfo(); // abstract method

}
