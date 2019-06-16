package application;

public class Account // Account Class

{
	private static int _balance; // total balance for user
	public static Account acc; // account class
	private int _sleep = 500; // sleep time for thread
	private static AccountInfo info; //AccountInfo class which contains the name of the users

	public synchronized void deposit(int val){  //Synchronize the operations (deposit)
		try
		{

			if(val >= 0) // if total balance is larger than withdraw money, it will start
			{
				System.out.println(info.getName()+" is making a deposit."); // one of the users in arrayList (There are three objects in the arrayList)

				try
				{
					Thread.sleep(_sleep);
				}
				catch (Exception e) //when exception fire, it will start.
				{
					e.printStackTrace();
				}
				System.out.printf( "Addtionial information: %s done sleeping\n", _sleep);
				System.out.println("========================");

				_balance = _balance + val;
				System.out.println(info.getName()+ " completed the deposit.");  // one of the users in arrayList (There are three objects in the arrayList)
			}
			else
			{
				System.out.println("Can't deposit.");
			}
			System.out.println(info.getName()+" deposited "+val);

		}
		catch (Exception e) { //when exception fire, it will start
			e.printStackTrace();
		}
	}

	public synchronized void withdraw(int val){ //Synchronize the operations (withdraw)
		try{

			if(_balance >= val) // if total balance is larger than withdraw money, it will start
			{
				System.out.println(info.getName()+" is making a withdraw.");  // one of the users in arrayList (There are three objects in the arrayList)
				try
				{
					Thread.sleep(_sleep);
				}
				catch (Exception e)  //when exception fire, it will start
				{
					e.printStackTrace();
				}
				_balance = _balance - val;
				System.out.printf( "%s done sleeping\n", _sleep );
				System.out.println(info.getName()+" completed the withdraw.");  // one of the users in arrayList (There are three objects in the arrayList)

			}
			else{
				System.out.println("Can't withdraw.");
			}
			System.out.println(info.getName()+" withdrew "+val);

		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int getBal(){ //get balance for a specific user
		return _balance;
	}

	public void setBal(int bal){ //set balance for a specific user
		Account._balance = bal;
	}

	public static Account getAcc(AccountInfo info) //get information from AccountInfo class(in Account Test class, main)
	{
		if(acc == null){
			acc = new Account();
		}
		Account.info = info;
		return acc;
	}

}