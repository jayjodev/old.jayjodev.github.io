using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Constructor2_Inheritance_
{
    class ChildClass : BaseClass
    {
        int c;
        public ChildClass(int a, int b, int c) : base(a, b)
        {
            this.c = c;

            Console.WriteLine("\nInside the constructor");
        }
    }
}
