using System;


namespace Constructor
{
    class Constructor
    {
        string user;
        int age;
        string address;

        public Constructor()
        {

        }
        public Constructor(string user, int age)
        {
            this.user = user;
            this.age = age;
        }

        public override string ToString()
        {
            return user + age + address;
        }

        public string Address
        {
            get
            {
                return address;
            }
            set
            {
                address = value;
            }
        }

        static void Main(string[] args)
        {

            Constructor FirsetUser = new Constructor();
            Constructor SecondUser = new Constructor("Jo",31);
            SecondUser.address = "Ontario";
            Console.WriteLine(SecondUser);

            Console.ReadKey();
        }
    }
}
