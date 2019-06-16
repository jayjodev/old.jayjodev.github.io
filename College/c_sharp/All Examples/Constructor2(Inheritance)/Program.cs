using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Constructor2_Inheritance_
{
    class Program
    {
        static void Main(string[] args)
        {
            BaseClass Obj1 = new BaseClass();
            ChildClass Obj2 = new ChildClass(1, 5, 6);


            Console.ReadKey();
        }
    }
}
