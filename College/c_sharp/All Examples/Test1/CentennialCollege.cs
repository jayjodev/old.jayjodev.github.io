using System;

namespace AdditionalWeek4
{
    class CentennialCollege
    {
        static void Main(string[] args)
        {
            int x = 0;
            Console.WriteLine("Welcome to Centennial College Online Computer Sales Center");
            while (x != -1)
            {
                Console.WriteLine("How many computer systems you want to buy (-1 to quit)");
                x = Convert.ToInt32(Console.ReadLine());
                Checkorder t1 = new Checkorder(x);
                if (x <= 10 && x != -1)
                {
                    Console.WriteLine("Your order has been processed successfully. You will receive your computer by mail within 7 days.");
                }
            }
            Console.WriteLine("Thanks for visiting Centennial College Online Laptop Sales Center. Visit us again");
            Console.ReadKey();
        }
    }
    public class Checkorder
    {
        int check;
        public Checkorder(int checkorderNumber)
        {
            try
            {
                if (checkorderNumber > 10)
                {
                    throw (new CheckorderException("Reorder Level Exception Raised: The items you ordered is not stock "));
                }
            }
            catch (CheckorderException e)
            {
                Console.WriteLine(e.Message);
            }
        }
    }
    public class CheckorderException : Exception
    {
        public CheckorderException(string message) : base(message)
        {

        }
    }
}