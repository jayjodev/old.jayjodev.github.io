using System;
using System.Collections.Generic;

namespace ExampleofDictionary
{
    class Program
    {
        static void Main(string[] args)
        {
            Dictionary<string, int> dictionary = new Dictionary<string, int>();
            dictionary.Add("apple", 100);
            dictionary.Add("windows", 200);

            if (dictionary.ContainsKey("apple"))
            {
                int value = dictionary["apple"];
                Console.WriteLine(value);
            }

            if (!dictionary.ContainsKey("linux"))
            {
                Console.WriteLine(false);
            }

            Console.WriteLine("Thanks!");
            Console.ReadKey();
        }
    }
}
