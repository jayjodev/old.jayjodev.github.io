using System;
using System.Collections.Generic;

namespace queue
{
    class Program
    {
        static void Main(string[] args)
        {
            //a new queue of integer data type
            Queue<int> q = new Queue<int>();

            q.Enqueue(5);
            q.Enqueue(10);
            q.Enqueue(23);
            q.Enqueue(64);

            foreach(int value in q)
            {
                Console.WriteLine(value);
            }
            Console.WriteLine("After Dequeue");
            // take out one element
            int deq = q.Dequeue();

            Console.WriteLine(deq);
            Console.WriteLine("=============");

            foreach (int value in q)
            {
                Console.WriteLine(value);
            }
            Console.WriteLine("=============");
            Console.WriteLine("After Peek");

            int peek = q.Peek();
            Console.WriteLine(peek);
            Console.WriteLine("=============");
            foreach (int value in q)
            {
                Console.WriteLine(value);
            }

            Console.ReadKey();
        }
    }
}
