using System;
using System.IO;
using System.Text;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace Week6_2_
{
    class Program
    {
        static void Main(string[] args)
        {
            Int64 x;

            try
            {
                //Open the File
                StreamWriter sw = new StreamWriter("C:\\Sample2.txt", true, Encoding.ASCII);

                //Writeout the numbers 1 to 10 on the same line.
                for (x = 0; x < 10; x++)
                {
                    sw.Write(x);
                }

                //close the file
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
