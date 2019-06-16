using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Week5
{
    class DerivedClass : BaseClass
    {
        public override void Method1()
        {
            Console.WriteLine("\nI am reporting from derived class overridden Method1()");
        }
        public override void Method2()
        {
            Console.WriteLine("\nI am reporting from derived class overridden Method2()");
        }

    }
}
