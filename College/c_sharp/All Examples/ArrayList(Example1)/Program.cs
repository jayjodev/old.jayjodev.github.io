using System;
using System.Collections;

namespace ExampleofArrayList
{
    class Program
    {
        static void Main(string[] args)
        {
            ArrayList myArrayList = new ArrayList();
            myArrayList.Add(1);
            myArrayList.Add("Two");
            myArrayList.Add(3);
            myArrayList.Add(4.5);

            //accessing individual item using indexer

            int firstElement = (int)myArrayList[0];
            Console.WriteLine(firstElement);

            string SecondElement = (string)myArrayList[1];
            Console.WriteLine(SecondElement);

            double fourthElement  = (double)myArrayList[3];
            Console.WriteLine(fourthElement);

            var firstElement2 = myArrayList[0];
            Console.WriteLine(firstElement2);

            Console.WriteLine("=================================================");

            foreach(var value in myArrayList)
            {
                Console.WriteLine(value);
            }

            Console.WriteLine("=================================================");
            Console.WriteLine("Insert New object to ArrayList");

            myArrayList.Insert(1, "Second Item");
            foreach (var value in myArrayList)
            {
                Console.WriteLine(value);
            }

            Console.WriteLine("=================================================");
            Console.WriteLine("Insert New object to ArrayList (using InsertRage)");

            ArrayList arrayList2 = new ArrayList();
            arrayList2.Add(10);
            arrayList2.Add(20);
            arrayList2.Add(30);
            arrayList2.Add(40);

            //arrayList2.InsertRange(2, myArrayList);

            foreach (var value in myArrayList)
            {
                Console.WriteLine(value);
            }

            //remove an object of ArrayList
            Console.WriteLine("=================================================");
            Console.WriteLine("Remove object of ArrayList");

            myArrayList.Remove(4.5);

            foreach (var value in myArrayList)
            {
                Console.WriteLine(value);
            }
            Console.WriteLine("===============================================");
            Console.WriteLine("Remove object of ArrayList(using index)");

            myArrayList.RemoveAt(0);
            foreach (var value in myArrayList)
            {
                Console.WriteLine(value);
            }

            //sort objects of ArrayList
            Console.WriteLine("=================================================");
            Console.WriteLine("sort arrayList2");

            arrayList2.Sort();
            foreach (var value in arrayList2)
            {
                Console.WriteLine(value);
            }

            Console.WriteLine("=================================================");
            Console.WriteLine("reverse arrayList2");

            arrayList2.Reverse();
            foreach (var value in arrayList2)
            {
                Console.WriteLine(value);
            }

            //check objects of ArrayList
            Console.WriteLine("=================================================");
            Console.WriteLine("Check an object of arrayList2");

            Console.WriteLine(myArrayList.Contains("Two"));

            Console.ReadKey();
        }
    }
}
