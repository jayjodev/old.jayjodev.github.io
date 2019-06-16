using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            List<Dog> dogs = new List<Dog>();
            dogs.Add(new Dog("Rocket"));
            dogs.Add(new Dog("Bullet"));
            dogs.Add(new Dog("Racket"));
            dogs.Add(new Dog("Cricket"));
            dogs.Sort();
            foreach (Dog dog in dogs)
            {
                Console.WriteLine(dog.Describe());
                Console.ReadKey();
            }

        }
        interface Ianimal
        {
            string Describe();
            string Name
            {
                get;
                set;
            }
        }
        class Dog : Ianimal, IComparable
        {
            private string name;
            public Dog(string name)
            {
                this.name = name;
            }
            public string Describe()
            {
                return "Hi, I am a dog and my name is : " + this.Name;
            }

            public int CompareTo(object obj)
            {
                if (obj is Ianimal)
                    return this.Name.CompareTo((obj as Ianimal).Name);
                return 0;

            }

            public string Name
            {

                get
                {
                    return name;
                }
                set
                {
                    name = value;
                }
            }



        }
    }
}
