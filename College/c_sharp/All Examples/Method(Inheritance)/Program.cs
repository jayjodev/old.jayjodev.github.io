using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Week5
{
    class Program
    {
        static void Main(string[] args)
        {

            //Creating a base class object with the help of the default constructor
            BaseClass bc = new BaseClass();
            DerivedClass dc = new DerivedClass();

            //Calling the methods in association of the base class object, the correct version will be called : polymorphism

            bc.Method1();
            bc.Method2();

            //Calling the methods in association of the derived class objects, the correct version will be called: polymorphic call
            dc.Method1();
            dc.Method2();

            Console.ReadKey();
        }
    }
}
