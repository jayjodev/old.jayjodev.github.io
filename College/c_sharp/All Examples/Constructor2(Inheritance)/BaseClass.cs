using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Constructor2_Inheritance_
{
    //parent class
    class BaseClass
    {
        //instance variables
        protected int a, b;
        //constructor of this class
        public BaseClass()
        {
            a = 0;
            b = 0;
            Console.WriteLine("\nI am in the bass class ' default constructor.");

        }

        //overloaded constructor
        public BaseClass(int a, int b)
        {
            this.a = a;
            this.b = b;
            Console.WriteLine("\nI am in the bass class ' overloaded constructor.");
        }

    }
}
