package application;

import java.util.Scanner;

public class Transaction implements Runnable //Runnable interface implement a Transaction class
{
// extends Thread
	private AccountInfo _info; //AccountInfo class information
	private int _accountnumber; //Additional information for user account number
	private int _sleep = 500; // sleep time for thread


	public Transaction(AccountInfo info, int accountnumber){ //Constructors that contains two information (user name, accountnumber)
		    this._info = info;
		    this._accountnumber = accountnumber;
	}

	public void run() //Perform deposit and withdraw operations in run method.
	{

		try {
			Account acc = Account.getAcc(_info);
			Scanner input = new Scanner(System.in);
			System.out.println("Account Number: "+ _accountnumber); //get withdrawal amount from a user

			System.out.print("Enter deposit amount: "); //get deposit amount from a user
			int deposit = input.nextInt();
			acc.deposit(deposit); //call deposit method with withdraw information

			try {
				Thread.sleep(_sleep);
			}
			catch (InterruptedException ex)
			{ }

			System.out.println("========================");
			System.out.println("Account Number: "+ _accountnumber); //get withdrawal amount from a user
			System.out.print("Enter withdrawal amount: "); //get withdrawal amount from a user

			int withdraw = input.nextInt();

			if(withdraw > Account.getBal()){ // If the a user balance is not enough to withdraw money, it will start
				System.out.println("You don't have enough funds.");
			}
			else{
				acc.withdraw(withdraw); //call withdraw method with withdraw information
			}
			System.out.println("Final balance: "+Account.getBal());
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}