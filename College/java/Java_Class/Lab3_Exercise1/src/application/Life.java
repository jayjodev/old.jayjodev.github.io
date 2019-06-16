/**Lab3_Exercise3. java
 * author: Gangrae Jo
 * purpose: Inheritance.
 */
package application;

public class Life extends Insurance {

	protected double _insurancecost; //instance variable
	@Override
	public void setInsuranceCost(double cost) { //set Insurance cost from super class
		this._insurancecost = cost;
	}

	@Override
	public void displayInfo() { //display information from super class
		System.out.println("Insurance cost: " + this._insurancecost + "- Type: " + this._typeofinsurance +
				"- Monthtly cost: " + this._monthlycost);
	}

}
