using System;
using System.Collections.Generic;

class Program
{
    static void Main()
    {

        //Using List<string>

        List<string> Class = new List<string>();
        Class.Add("Franndy");
        Class.Add("Jay Jo");
        Class.Insert(1, "Jasha");

        foreach (string value in Class)
        {
            Console.WriteLine(value);
        }

        //Using List<int>

        List<int> myList = new List<int>();
        myList.Add(55);
        myList.Add(10);
        myList.Add(70);
        myList.Add(2);

        Console.WriteLine("\nThe list in original order: ");

        foreach (int value in myList)
        {
            Console.WriteLine(value);
        }

        Console.WriteLine("\nThe list in sorted ascending order: ");
        myList.Sort();

        foreach (int value in myList)
        {
            Console.WriteLine(value);
        }

        Console.WriteLine("\nThe list in reversed ascending order: ");
        myList.Reverse();

        foreach (int value in myList)
        {
            Console.WriteLine(value);
        }

        Console.ReadKey();
    }
}