using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ASSIGNMENT3
{
    class Questionforuser
    {
        private static string[] country = { "England", "USA" };
        public static void checkAnswer(int output)
        {
            if (country[output] == "England")
            {
                Console.WriteLine("Your answer is {0} ", country[output]);
                Console.WriteLine("It is correct");

            }
            else if (country[output] == "USA")
            {
                Console.WriteLine("Your answer is {0} ", country[output]);
                Console.WriteLine("It is wrong");
            }
            else
            {
                Console.WriteLine("Your input should be 1 or 2");
            }

        }

    }
}
