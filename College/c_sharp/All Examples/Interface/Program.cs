using System;

namespace interfacesProgram
{
    class Program
    {
        static void Main(string[] args)
        {
            LivingExpenses LivingCost = new LivingExpenses();
            LivingCost.setCost(8500, 1000, 4000, 500, 1000);

            LivingCost.instruction();
            LivingCost.AcademicFees();
            LivingCost.LivingCost();
            LivingCost.TotalFee();
            Console.ReadKey();
        }
    }
}
