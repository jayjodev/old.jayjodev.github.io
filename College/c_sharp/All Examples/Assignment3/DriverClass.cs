using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ASSIGNMENT3
{
    class DriverClass
    {
        static void Main(string[] args)
        {
            int input, output = 0;

            Publication BaseObject = new Publication();
            Publication BaseObjectValue = new Publication("Vintage", "Toronto", "Canada");

            //Create objects from the base class. Use the default as well as the overloaded constructor to create them.
            Book BookObject = new Book();
            BookObject.setAll("Contagious", "1451686587", "Jonah Berger ", 20.3);
            BookObject.setAllFormbase("Simon & Schuster", "Newyork", "USA");

            Book BookObjectValue = new Book("Vintage", "London", "England", "The Sense of an Ending", "0307360822", "Julian Barnes", 15.5);

            //Set the object’s values by calling methods, whenever needed. Display their values.

            //Get value from method
            Console.WriteLine("Book information // Data from Method");
            Console.WriteLine(BookObject);

            //Set value from constructor
            Console.WriteLine("\nBook information // Data from a derived constructor");
            Console.WriteLine("Publication name is {0}", BookObjectValue.gettitle());
            Console.WriteLine("Publication city is {0}", BookObjectValue.getPubCity());
            Console.WriteLine("Publication country is {0}", BookObjectValue.getPubCountry());
            Console.WriteLine("Title is {0}", BookObjectValue.gettitle());
            Console.WriteLine("ISBN is {0}", BookObjectValue.getisbn());
            Console.WriteLine("Price is {0:c}", BookObjectValue.getprice());

            // Exception handling (case 2)

            Console.WriteLine("\nEnter the rating of book : ");
            BaseObject.PubRating = Convert.ToInt32(Console.ReadLine());

            try
            {
                Console.WriteLine("\nWhere is the publication country of 'the sense of an Ending' ");
                Console.WriteLine("1 (England) 2 (USA) : ");
                input = Convert.ToInt32(Console.ReadLine());
                output = input - 1;
                Questionforuser.checkAnswer(output);
            }
            catch (IndexOutOfRangeException e)
            {
                Console.WriteLine(e.Message);
            }

            //Create objects from the derived class. Set the values by calling appropriate methods.Display their values.

            Console.ReadKey();
        }
    }
}
