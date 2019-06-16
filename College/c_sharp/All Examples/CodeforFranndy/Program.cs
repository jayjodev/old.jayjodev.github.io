using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2
{
    class MainClass
    {
        public static void Main(string[] args)
        {
            Pizza p = new Pizza();

            p.setPizzaType("Pepperoni");

            p.Order();
            p.wrapPizza();
            Console.ReadKey();
        }
    }

    public class Pizza : IPizza, IBox
    {
        string pizzaType;

        public Pizza()
        {

        }
        public Pizza(string pizzaType)
        {
            this.pizzaType = pizzaType;
        }

        public void setPizzaType(string p)
        {
            pizzaType = p;
        }

        public string getPizzaType()
        {
            return pizzaType;
        }
        public void Order()
        {
            Console.WriteLine("You order a {0} pizza", pizzaType);
        }

        public void wrapPizza()
        {
            Console.WriteLine("Your {0} pizza has been wrapped up. Enjoy!", pizzaType);
        }


    }

    public interface IPizza
    {
        void Order();
    }
    public interface IBox
    {
        void wrapPizza();
    }
}

