using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Week5
{
    class BaseClass
    {

        //declaring a virtual method which will be overridden in the child class
        public virtual void Method1()
        {
            Console.WriteLine("\nI am reporting from base class Method1()");
        }
        //declaring another virtual method which also will be overridden in the child class
        public virtual void Method2()
        {
            Console.WriteLine("\nI am reporting from base calss mehtod2()");
        }



    }
}