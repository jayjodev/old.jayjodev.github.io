using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Constructor
{
    class BaseClass
    {
        //the revival of default constructor
        //With static variable is same location in memory.
        public static int x = 0;
        public BaseClass()
        {
            Console.WriteLine("\nI am called from the default constructor during the construction of the base class`s object");
            call();
            x++;
        }
        public static void call() => Console.WriteLine(x);
        //an overloaded constructor with a string

      public BaseClass(string message)
       {
           Console.WriteLine("\nI am called from the overloaded constructor during the " +
               "construction of the base class`s object : " + message);
        }
    }
}
