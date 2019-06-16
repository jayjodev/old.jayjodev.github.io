using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ASSIGNMENT3
{
    class Publication
    {
        //Instance variables: PubName (string), PubCity (string), PubCountry (string)
        private string PubName;
        private string PubCity;
        private string PubCountry;
        private int pubRating;

        //Constructors the default constructor, a constructor that sets all the instance variables.
        public Publication()
        {

        }
        public Publication(string PubName, string PubCity, string PubCountry)
        {
            this.PubName = PubName;
            this.PubCity = PubCity;
            this.PubCountry = PubCountry;
        }

        //A property: PubRating (int) and Exception handling
        public int PubRating
        {
            get
            {
                return pubRating;
            }
            set
            {
                try
                {
                    if (value <= 0)
                    {
                        throw new Exception("please enter above 0");
                    }
                    else if (value >= 100)
                    {
                        throw new Exception("Please enter below 100");
                    }
                    else
                    {
                        pubRating = value;
                        Console.WriteLine("The Rating is {0}point", pubRating);
                    }
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }

            }
        }

        //Method: setAll() to set all the instance variables` values passed to it.
        public virtual void setAllFormbase(string PubName, string PubCity, string PubCountry)
        {
            this.PubName = PubName;
            this.PubCity = PubCity;
            this.PubCountry = PubCountry;
        }

        //Method to get each of the instance variable`s values one by one.

        public virtual string getPubName()
        {
            return PubName;
        }
        public virtual string getPubCity()
        {
            return PubCity;
        }
        public virtual string getPubCountry()
        {
            return PubCountry;
        }
    }
}
