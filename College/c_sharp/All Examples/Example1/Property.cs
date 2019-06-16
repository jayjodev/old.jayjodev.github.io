using System;

namespace Example1
{
    class Property
    {
        public Property()
        {

        }
        public string Name
        {
            get;
            set;

        }
        public int Age
        {
            get;
            set;
        }

        public override string ToString()
        {
            return "Persone`s Name: " + Name + "\nPerson`s Age" + Age;
        }

        static void Main(string[] args)
        {
            Property Data= new Property();

            Data.Name = "Gangrae Jo";
            Data.Age = 31;
            Console.WriteLine(Data);
            Console.ReadKey();
        }
    }
}
