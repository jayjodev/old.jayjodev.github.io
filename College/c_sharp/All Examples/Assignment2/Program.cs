using System;

namespace ASSIGNMENT2
{
    class Driverclass
    {
        static void Main(string[] args)
        {
            Account MyAccount = new Account();
            MyAccount.setAccountsBalance(5000.00, 8000.00);
            Account MySpouseAccount = new Account();
            MySpouseAccount.setAccountsBalance(10000.00, 15000.00);
            Account SumAccount = new Account();
            SumAccount = MyAccount + MySpouseAccount;

            // Get values.
            double MySavingAccount = MyAccount.getSavingsBalance();
            double MyCheqingBalance = MyAccount.getCheqingBalance();
            double MySavingBalanceBeforeDeduction = MyAccount.getSavingsBalBeforeDeduction();

            double MySpouseSavingAccount = MySpouseAccount.getSavingsBalance();
            double MySpouseCheqingBalance = MySpouseAccount.getCheqingBalance();
            double MySpouseSavingBalanceBeforeDeduction = MySpouseAccount.getSavingsBalBeforeDeduction();

            double SumSavingAccount = SumAccount.getSavingsBalance();
            double SumCheqingBalance = SumAccount.getCheqingBalance();

            string Myname = "Jo";

            Console.WriteLine("MY ACCOUNT STATUS :");
            Console.WriteLine("===============================================================");
            Console.WriteLine(MyAccount);
            Console.WriteLine("\t My saving balance before deduction was {0}.", MySavingBalanceBeforeDeduction.ToString("C"));
            Console.WriteLine("\nMY SPOUSE`S ACCOUNT STATUS :");
            Console.WriteLine("===============================================================");
            Console.WriteLine("\t My Spouse`s saving balance is  {0}.", MySpouseSavingAccount.ToString("C"));
            Console.WriteLine("\t My Spouse`s cheqing balance is {0}.", MySpouseCheqingBalance.ToString("C"));
            Console.WriteLine("\t My Spouse`s saving balance before deduction was {0}.", MySpouseSavingBalanceBeforeDeduction.ToString("C"));

            //Check balence
            if ((MySavingAccount + MyCheqingBalance) > (MySpouseSavingAccount + MySpouseCheqingBalance))
            {
                Console.WriteLine("\n*{0} has a higher account balance than his spouse. \n", Myname);
            }
            else if ((MySavingAccount + MyCheqingBalance) < (MySpouseSavingAccount + MySpouseCheqingBalance))
            {
                Console.WriteLine("\n*{0} has a lower account balance than his spouse. \n", Myname);
            }
            else
            {
                Console.WriteLine("\n*{0} and his spouse have the same account balance. \n", Myname);
            }

            Console.WriteLine("IN SUM UP :");
            Console.WriteLine("===============================================================");
            Console.WriteLine("\t Our combined account balance are :");
            Console.WriteLine("\t Saving balance is  {0}.", SumSavingAccount.ToString("C"));
            Console.WriteLine("\t Chequing balance is  {0}.", SumCheqingBalance.ToString("C"));

            //User Input
            Console.Write("\nEnter the annual interest rate (%): ");
            Account.interstRate = Convert.ToDouble(Console.ReadLine());
            Console.Write("\nEnter the number of years the money is invested for: ");
            Account.numYear = Convert.ToInt32(Console.ReadLine());

            // Annual compound interest formula
            // A = P(1 + r/n)^nt

            double Cal1 = 1 + Account.interstRate / 100 / 12;
            double Cal2 = 12 * Account.numYear;
            double Cal3 = Math.Pow(Cal1, Cal2);

            double TotalMySaving = MySavingAccount * (Cal3);
            double TotalSpouseSaving = MySpouseSavingAccount * (Cal3);
            double TotalSumSaving = SumSavingAccount * (Cal3);

            Console.WriteLine("\nAFTER {0} YEARS <with interest> :", Account.numYear);
            Console.WriteLine("===============================================================");
            Console.WriteLine("\t My total saving account will be : {0:C}.", TotalMySaving);
            Console.WriteLine("\t My Spouse`s total saving account will be : {0}.", TotalSpouseSaving.ToString("C"));
            Console.WriteLine("\t Our combined saving account will be : {0}.", TotalSumSaving.ToString("C"));
            Console.WriteLine("");
            Console.WriteLine("**Annual compound interest // Compunded monthly");

            Console.ReadKey();
        }
    }
}
