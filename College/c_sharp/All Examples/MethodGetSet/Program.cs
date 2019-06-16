using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodGetSet
{
    class Box
    {
        //instance variables
        private double length;
        private double breadth;
        private double height;

        //Set Methods

        public void setLength(double len)
        {
            length = len;
        }

        public void setBreadth(double bre)
        {
            breadth = bre;
        }

        public void setHeight(double height)
        {
            this.height = height;
        }

        public void setAll(double len, double bre, double hei)
        {
            length = len;
            breadth = bre;
            height = hei;
        }

        public double getvolume()
        {
            return length * breadth * height;
        }

        public double getlength()
        {
            return length;
        }

        public double getBreadth()
        {
            return breadth;
        }

        public double getHeight()
        {
            return height;
        }
        public void setDimension(double len, double bre, double hei)
        {
            length = len;
            breadth = bre;
            height = hei;

        }

        public static Box operator +(Box b, Box c)
        {
            Box box = new Box();
            box.length = b.length + c.length;
            box.breadth = b.breadth + c.breadth;
            box.height = b.height + c.height;
            return box;
        }

        public override string ToString()
        {
            return "\nLength: " + length + "\nBreadth: " + breadth + "\nHeight: " + height;
        }

        static void Main(string[] args)
        {
            Box Box1 = new Box();
            Box Box2 = new Box();
            Box Box3 = new Box();

            //setting the dimensions of Box1 one after another
            Box1.setLength(4.0);
            Box1.setBreadth(3.0);
            Box1.setHeight(5.0);
            //setting the dimensions of Box2 all at a time
            Box2.setDimension(5.0, 6.0, 7.0);
            //Volume of Box1
            Console.WriteLine("\nThe volume of Box1 is {0}", Box1.getvolume());
            double vo1 = Box2.getvolume();
            Console.WriteLine("\nThe volume of Box2 is {0} ", vo1);
            
            //using overloaded +
            Box3 = Box1 + Box2;
            Console.WriteLine("\nThe length of Box3 is {0} \nThe breadth of Box3 is {1} \nThe heigth of Box3 is {2}", Box3.getlength(), Box3.getBreadth(), Box3.getHeight());
            //get the volume of Box3
            Console.WriteLine("\nThe volume of Box3 is {0}", Box3.getvolume());
            Console.WriteLine(Box3);
            Console.ReadKey();
        }
    }
}
