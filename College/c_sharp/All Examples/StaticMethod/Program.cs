using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StaticMethod
{
    class Program
    {
        static void Main(string[] args)
        {
            //The ShowWelcomeMessage()Method in the HelloClass is static,and therefore 
            //it is called from the Main() method method without an object reference 
            //(that is, without an object name and a dot before the method name. 
            //It also resides in the same class as the the Main() method, so it can be called
            //without using its class named.
            ShowWelcomeMessage();
            double x = ShowWelcomeMessage();
            Console.WriteLine(x);
            Console.ReadKey();


        }

        private static double ShowWelcomeMessage()
        {
            Console.WriteLine("Welcome.");
            Console.WriteLine("Have fun!");
            Console.WriteLine("Enjy the program!");
            return 2;

        }
    }
}
