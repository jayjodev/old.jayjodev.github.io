/**Lab3_Exercise3. java
 * author: Gangrae Jo
 * purpose: CityToronto bank program.
 */

package application;

public class PersonalMortgage extends Mortgage //Inheritance Mortgage class.
{

	public PersonalMortgage(int mortgage_number, String customer_name, double amountofmortgage, double interest_rate, int term) //get info from super class
	{
		super(mortgage_number, customer_name, amountofmortgage, interest_rate, term);
		setInterestRate(getInterestRate() + 2); // Its constructor sets the interest rate to 2% over the current prime rate.
	}

	@Override
	public String toString() //Override method to print
	{
		return
				"\n====================="
				+ "\nPersonal Mortgage"
				+ "\n====================="
				+ "\nMortgage Number: " + getMortgageNumber()
				+ "\nCustomer Name: " + getCustomerName()
				+ "\nAmount of Morgage: " + getAmountofmortgage()
				+ "\nInterest Rate: " + getInterestRate()
				+ "\nTerm of years: " + getTerm()
				+ "\n====================="
				+ "\nMortgage Information " + getMortgageInfo();
	}

}