using System;
using System.Collections;

namespace ExampleofHashtable2
{
    class Program
    {
        static Hashtable GetHashTable()
        {
            Hashtable hashtable = new Hashtable();
            hashtable.Add(300, "Pineapple");

            hashtable.Add(400, 1000);
            return hashtable;
        }
        static void Main(string[] args)
        {
            Hashtable hashtable = GetHashTable();

            // The key is identifier.
            // Calling value, Thus only key and value.
            Console.WriteLine("What is the result of Hashtable ");

            string value1 = (string)hashtable[300];
            Console.WriteLine(value1);
            // int value2 = (int)hashtable["Area"];
            // Console.WriteLine(value2);

            foreach (int key in hashtable.Keys)
            {
                Console.WriteLine(key);
            }

            Console.WriteLine("Thanks");
            Console.ReadKey();
        }
    }
}
