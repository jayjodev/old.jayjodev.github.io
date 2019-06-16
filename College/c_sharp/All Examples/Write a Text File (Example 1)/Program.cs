using System;
using System.IO;

namespace Write_a_Text_File__Example_2_
{
    class Program
    {
        static void Main(string[] args)
        {
            try
            {
                //Pass the filepath and filename to the StreamWriter Constructor
                StreamWriter sw = new StreamWriter("C:\\Sample.txt");

                //Write a line of text
                sw.WriteLine("You are great");

                //Write a second line of text
                sw.WriteLine("From the StreamWriter class");

                //Close the file
                sw.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception: " + e.Message);
            }
            finally
            {
                Console.WriteLine("Executing finally block.");
            }
        }
    }
}
