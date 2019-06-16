/**Lab3_Exercise3. java
 * author: Gangrae Jo
 * purpose: CityToronto bank program.
 */
package application;

public abstract class Mortgage implements MortgageConstants //Abstract class(Super Class) that implements the MortgageConstants interface.
{

	private int mortgage_number; // instance variables
	private String customer_name;
	private double amountofmortgage;
	private double interest_rate;
	private int term;

	public int getMortgageNumber() //Method to use Business and Personal Mortgage class
	{
		return mortgage_number;
	}

	public void setMortgageNumber(int mortgage_number) //Set information from user input
	{
		this.mortgage_number = mortgage_number;
	}

	public String getCustomerName() //Method to use Business and Personal Mortgage class
	{
		return customer_name;
	}

	public void setCustomerName(String customer_name) //Set information from user input
	{
		this.customer_name = customer_name;
	}

	public double getAmountofmortgage() //Method to use Business and Personal Mortgage class
	{
		return amountofmortgage;
	}

	public void setAmountofmortgage(double amountofmortgage) //Set information from user input
	{
		this.amountofmortgage = amountofmortgage;
	}

	public double getInterestRate() //Method to use Business and Personal Mortgage class
	{
		return interest_rate;
	}

	public void setInterestRate(double interest_rate) //Set information from user input
	{
		this.interest_rate = interest_rate;
	}

	public int getTerm() //Method to use Business and Personal Mortgage class
	{
		return term;
	}

	public void setTerm(int term) //Set information from user input
	{
		this.term = term;
	}

	public Mortgage(int mortgage_number, String customer_name, double amountofmortgage, double interest_rate, int term) {
		super();
		this.mortgage_number = mortgage_number;
		this.customer_name = customer_name;

		if(amountofmortgage <= maximum) //Set Maximum of amount ($300,000)
		{
			this.amountofmortgage = amountofmortgage;
		}
		else
		{
			this.amountofmortgage =maximum;
		}

		this.interest_rate = interest_rate;

		if(term != 3 || term != 5 ) //Check whether short term or not
		{
			this.term = short_term;
		}
	}

	public String getMortgageInfo() // Mortgage Information
	{
		return
				"\n====================="
				+ "\nMortgage Number: " + mortgage_number
				+ "\nCustomer Name: " + customer_name
				+ "\nAmount of Morgage: " + customer_name
				+ "\nInterest Rate: " + interest_rate
				+ "\nTerm of years: " + term;
	}

	@Override
	public String toString() // Override method to print
	{
		return
				"\n====================="
				+ "\nMortgage Number: " + mortgage_number
				+ "\nCustomer Name: " + customer_name
				+ "\nAmount of Morgage: " + customer_name
				+ "\nInterest Rate: " + interest_rate
				+ "\nTerm of years: " + term;
	}

}
