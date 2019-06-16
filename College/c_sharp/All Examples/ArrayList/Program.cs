using System;
using System.Collections;

namespace TestArray
{
    class program
    {
        static void Main(string[] args)
        {
            ArrayList arrayList1 = new ArrayList();
            arrayList1.Add(1);
            arrayList1.Add("Two");
            arrayList1.Add(1.2);

            ArrayList arrayList2 = new ArrayList();
            arrayList1.Add(100);
            arrayList1.Add(200);
            arrayList1.AddRange(arrayList2); //adding an entire arrayList

            for(int i=0; i< arrayList1.Count; i++)
            {
                Console.WriteLine(arrayList1[i]);
            }

            Console.ReadKey();

        }
    }
}
