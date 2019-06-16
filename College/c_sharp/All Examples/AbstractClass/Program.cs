using System;

namespace AbstractClass
{
    class Program
    {
        static void Main(string[] args)
        {
            double NumericalMessage;
            double Mod;
            double MySecrekey;
            double RecivedMessage;

            DerivedClass_Math_ BaseObject = new DerivedClass_Math_();
            // I used Math class example.
            //"NumericalMessage= 7 Mod= 13 My Secrekey= 5 RecivedMessage= 3"
            // You can change 4 information using this program

            BaseObject.instruction();

            Console.Write("Write Numerical Message: ");
            NumericalMessage = Convert.ToDouble(Console.ReadLine());
            Console.Write("Write Mod: ");
            Mod = Convert.ToDouble(Console.ReadLine());
            Console.Write("Write MySecrekey: ");
            MySecrekey = Convert.ToDouble(Console.ReadLine());
            Console.Write("Write RecivedMessage: ");
            RecivedMessage = Convert.ToDouble(Console.ReadLine());

            // Get result

            BaseObject.setAll(NumericalMessage, Mod, MySecrekey, RecivedMessage);
            BaseObject.SecretkeyMethod();
            Console.ReadKey();

        }
    }
}