using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Overrideandvirtual
{
    class DerivedClass : BaseClass
    {
        public override void Method1()
        {
            Console.WriteLine("Derive Method1(), Sir/Madam.");
        }

        public override void Method2()
        {
            Console.WriteLine("Derive Method2(), Sir/Madam.");
        }



    }
}
