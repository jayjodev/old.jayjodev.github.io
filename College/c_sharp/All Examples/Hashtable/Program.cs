using System;
using System.Collections;

namespace ExampleofHashtable
{
    class Program
    {
        static void Main(string[] args)
        {
            //Example of hashtable, a non-generic collection
            Hashtable hashtable = new Hashtable();
            hashtable[1] = "One";
            hashtable[2] = "Two";
            hashtable[3] = "Three";
            hashtable[4] = 100;

            foreach(DictionaryEntry entry in hashtable)
            {
                Console.WriteLine("{0}, {1}", entry.Key, entry.Value);
            }

            Console.WriteLine("Thanks!");
            Console.ReadKey();
        }
    }
}
