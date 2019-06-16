using System;

namespace ASSIGNMENT2
{
    class Account
    {
        private double SavingsBalance;
        private double CheqingBalance;
        public static double interstRate = 0.025;
        public static int numYear = 5;

        //4 method set, get

        public void setAccountsBalance(double SavingsBalance, double CheqingBalance)
        {
            this.SavingsBalance = SavingsBalance;
            this.CheqingBalance = CheqingBalance;
        }
        public double getSavingsBalance()
        {
            return SavingsBalance;
        }
        public double getCheqingBalance()
        {
            return CheqingBalance;
        }
        // 1 additional method
        public double getSavingsBalBeforeDeduction()
        {
            return SavingsBalance + 10.0;
        }
        public override string ToString()
        {
            return "\t My saving balance is " + SavingsBalance.ToString("C") + "." + "\n\t My cheqing balance is " + CheqingBalance.ToString("C") + ".";
        }

        //Using sum up
        public static Account operator +(Account MyAccount, Account MySpouseAccount)
        {
            Account SumAccount = new Account();
            SumAccount.SavingsBalance = MyAccount.SavingsBalance + MySpouseAccount.SavingsBalance;
            SumAccount.CheqingBalance = MyAccount.CheqingBalance + MySpouseAccount.CheqingBalance;
            return SumAccount;
        }
    }
}