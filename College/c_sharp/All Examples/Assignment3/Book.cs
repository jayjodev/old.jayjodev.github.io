using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ASSIGNMENT3
{
    class Book : Publication
    {
        private string title;
        private string isbn;
        private string author;
        private double price;
        public Book()
        {

        }
        public Book(string PubName, string PubCity, string PubCountry, string title, string isbn, string author, double price) : base(PubName, PubCity, PubCountry)
        {
            this.title = title;
            this.isbn = isbn;
            this.author = author;
            this.price = price;
        }
        //set values
        public void setAll(string title, string isbn, string author, double price)
        {
            this.title = title;
            this.isbn = isbn;
            this.author = author;
            this.price = price;
        }
        public string gettitle()
        {
            return title;
        }
        public string getisbn()
        {
            return isbn;
        }
        public string getauthor()
        {
            return author;
        }
        public double getprice()
        {
            return price;
        }

        //Override Method
        public override void setAllFormbase(string PubName, string PubCity, string PubCountry)
        {
            base.setAllFormbase(PubName, PubCity, PubCountry);
        }
        public override string getPubName()
        {
            return base.getPubName();
        }
        public override string getPubCity()
        {
            return base.getPubCity();
        }
        public override string getPubCountry()
        {
            return base.getPubCountry();
        }
        public override string ToString()
        {
            return "Publication name is " + getPubName() + ".\n" + "Publication city is " + getPubCity() + ".\n" +
                   "Publication country is " + getPubCountry() + ".\n" + "Title is " + title + ".\n" +
                   "ISBN is " + isbn + ".\n" + "Price is " + price.ToString("C");
        }
    }
}
