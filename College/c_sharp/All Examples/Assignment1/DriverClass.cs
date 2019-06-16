using System;

namespace ASSIGNMENT1
{
    class DriverClass
    {
        static void Main(string[] args)
        {
            Console.WriteLine("---------------------------------------------------------------------");
            Console.WriteLine("//Using defalut Constructor + 3 set Method + 3 get Method + 1 property");
            Employee Em1 = new Employee();
            Em1.setId(300912345);
            Em1.setName("Gangrae Jo");
            Em1.setSalary(9700000);
            Em1.EmpAddress = "Centennial Place";
            Console.WriteLine("\nEmplpoyee`s Id: " + Em1.getId() + "\nEmployee`s Name: " + Em1.getName() + "\nEmployee`s Salary: " + Em1.getSalary());
            Console.WriteLine("Employee`s Address: " + Em1.EmpAddress);
            //Empty Constructor;

            Console.WriteLine("---------------------------------------------------------------------");
            Console.WriteLine("//Using 1 argument Constructor + 2 set Method + 3 get Method + 1 property");
            Employee Em2 = new Employee(300948013);
            Em2.setName("Nishit");
            Em2.setSalary(9500000);
            Em2.EmpAddress = "Scarborough";
            Console.WriteLine("\nEmplpoyee`s Id: " + Em2.getId() + "\nEmployee`s Name: " + Em2.getName() + "\nEmployee`s Salary: " + Em2.getSalary());
            Console.WriteLine("Employee`s Address: " + Em2.EmpAddress);
            //1 argument

            Console.WriteLine("---------------------------------------------------------------------");
            Console.WriteLine("//Using 2 argument Constructor + 1 set Method + 3 get Method + 1 property");
            Employee Em3 = new Employee(300955555, "Rio");
            Em3.setSalary(9600000);
            Em3.EmpAddress = "Toronto";
            Console.WriteLine("\nEmplpoyee`s Id: " + Em3.getId() + "\nEmployee`s Name: " + Em3.getName() + "\nEmployee`s Salary: " + Em3.getSalary());
            Console.WriteLine("Employee`s Address: " + Em3.EmpAddress);
            //2 argument

            Console.WriteLine("---------------------------------------------------------------------");
            Console.WriteLine("//Using 3 argument Constructor + 3 get Method + 1 property");
            Employee Em4 = new Employee(302304023, "Tim", 705000);
            Em4.EmpAddress = "Ontario";
            Console.WriteLine("\nEmplpoyee`s Id: " + Em4.getId() + "\nEmployee`s Name: " + Em4.getName() + "\nEmployee`s Salary: " + Em4.getSalary());
            Console.WriteLine("Employee`s Address: " + Em4.EmpAddress);
            //3 argument

            Console.WriteLine("---------------------------------------------------------------------");
            Console.WriteLine("//Using defalut Constructor + 3 set Method + 1 property + Override Method");

            Employee Em5 = new Employee();
            Em5.setId(308982939);
            Em5.setName("Anaf");
            Em5.setSalary(8200000);
            Em5.EmpAddress = "NewYork";
            Console.WriteLine(Em5);
            Console.WriteLine("Employee`s Address: " + Em5.EmpAddress);
            //override example

            Console.ReadKey();
        }
    }
}
