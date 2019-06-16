using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Overrideandvirtual
{
    class Tester
    {
        static void Main(string[] args)
        {
            BaseClass bc = new BaseClass();
            DerivedClass dc = new DerivedClass();
            bc.Method1();
            bc.Method1();

            dc.Method1();
            dc.Method2();
            Console.ReadKey();

        }
    }
}
