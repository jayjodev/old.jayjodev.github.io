using System;

namespace AbstractClass
{
    abstract class ModernCatography
    {
        protected double NumericalMessage;
        protected double Mod;
        protected double Mykeynumber;
        protected double RecivedMessage;
        public ModernCatography(double NumericalMessage, double Mod, double Mykeynumber, double RecivedMessage)
        {
            this.NumericalMessage = NumericalMessage;
            this.Mod = Mod;
            this.Mykeynumber = Mykeynumber;
        }

        public ModernCatography()
        {

        }

        // Two abstract Method
        abstract public void instruction();
        abstract public void SecretkeyMethod();

    }
}