using System;

namespace AdditionalWeek4
{
    class TestTemperature
    {
        static void Main(string[] args)
        {
            Temperature t1 = new Temperature(0);
            Console.ReadKey();
        }
    }

    public class Temperature
    {
        int temperature;
        public Temperature(int temp)
        {
            try
            {
                temperature = temp;
                if (temperature == 0)
                {
                    throw (new TempIsZeroException("Zero temperature not accepted."));
                }

            }
            catch (TempIsZeroException e)
            {
                Console.WriteLine(e);
            }
            finally
            {
                Console.WriteLine("Finally");
            }
        }
    }
    public class TempIsZeroException : Exception
    {
        public TempIsZeroException(string message) : base(message)
        {

        }
    }
}