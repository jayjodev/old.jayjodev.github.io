using System;

namespace AbstractClass
{
    class DerivedClass_Math_ : ModernCatography
    {
        public void setAll(double NumericalMessage, double Mod, double Mykeynumber, double RecivedMessage)
        {
            this.NumericalMessage = NumericalMessage;
            this.Mod = Mod;
            this.Mykeynumber = Mykeynumber;
            this.RecivedMessage = RecivedMessage;
        }
        public double getNumericalMessage()
        {
            return NumericalMessage;
        }
        public double getMod()
        {
            return Mod;
        }
        public double getMykeynumber()
        {
            return Mykeynumber;
        }
        public double getRecivedMessage()

        {
            return RecivedMessage;
        }

        public override void instruction()
        {
            Console.WriteLine("Modern Catography");
            Console.WriteLine("This Calculation program will find out your Secrekey using recevied Message");
            Console.WriteLine("This Calculation program will calculate the key we share with public");
            Console.WriteLine("===========================================================");
        }
        public override void SecretkeyMethod()
        {
            double firstCalculation = Math.Pow(NumericalMessage, Mykeynumber);
            double SendingMessage = firstCalculation % Mod;
            // You should send this message to receiver
            double SecondCalculation = Math.Pow(RecivedMessage, Mykeynumber);
            double Publickey = SecondCalculation % Mod;

            for (int Secretkey = 1; Secretkey < 1000; Secretkey++)
            {
                double Math1 = Math.Pow(SendingMessage, Secretkey);

                double e = Math1 % Mod;

                if (e == Publickey)
                {
                    double final = Math.Pow(NumericalMessage, Secretkey);
                    if ((final % Mod) == RecivedMessage)
                    {
                        Console.WriteLine("Your secret key is {0}", Secretkey);
                        Console.WriteLine("Public key is {0}", Publickey);

                    }
                }
            }

        }

    }
}
