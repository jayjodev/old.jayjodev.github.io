using System;
using System.Collections.Generic;


namespace ExampleofLinkedList
{
    class Program
    {
        static void Main(string[] args)
        {
            //Create a new linked list
            LinkedList<string> linked = new LinkedList<string>();
            linked.AddLast("dog");
            linked.AddLast("cat");
            linked.AddLast("man");
            linked.AddLast("monkey");
            //Add lisked list first
            linked.AddFirst("horse");

            LinkedListNode<string> node = linked.Find("man");
            linked.AddAfter(node, "gorilla");
            linked.AddBefore(node, "zebra");


            foreach (var item in linked)
            {
                Console.WriteLine(item);
            }
            Console.ReadKey();
        }
    }
}
