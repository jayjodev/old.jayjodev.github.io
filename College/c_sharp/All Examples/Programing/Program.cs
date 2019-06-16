using System;
using System.Collections.Generic;

namespace Programing
{
    class Program
    {
        static Stack<int> GetStack()
        {
            Stack<int> stack = new Stack<int>();
            stack.Push(100);
            stack.Push(2000);
            stack.Push(1000);
            stack.Push(2005);
            return stack;
        }
        static void Main(string[] args)
        {
            var stack = GetStack();
            Console.WriteLine("==== Stack Contents ====");

            foreach (int i in stack)
            {
                Console.WriteLine(i);
            }
            //pop the top element
            int pop = stack.Pop();

            Console.WriteLine();
            //Showing the popped element
            Console.WriteLine(pop);

            Console.WriteLine();
            foreach (int i in stack)
            {
                Console.WriteLine(i);
            }
            Console.WriteLine();
            int peek = stack.Peek();


            foreach (int i in stack)
            {
                Console.WriteLine(i);
            }

            int count = stack.Count;
            Console.WriteLine("==== Stack size ====");
            Console.WriteLine(count);

            Console.WriteLine("==== Clear Stack ====");
            stack.Clear();
            Console.WriteLine(stack.Count);

            Console.ReadKey();
        }
    }
}
