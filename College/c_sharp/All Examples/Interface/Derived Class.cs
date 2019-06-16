using System;

namespace interfacesProgram
{
    public class LivingExpenses : AcademicFees, LivingCost
    {
        public double Academicfees;
        public double CollegeTuitionFee;
        public double BookCost;

        public double Livingcost;
        public double ResidenceFee;
        public double transportationFee;
        public double FoodCost;

        public double Totalcost;
        public LivingExpenses()
        {
        }

        // Using interface signatures of methods.
        public void AcademicFees()
        {
            Academicfees = CollegeTuitionFee + BookCost;
            Console.WriteLine("Academic Cost is {0:C} (One Semester in Centennial College)", Academicfees);
        }
        public void LivingCost()
        {
            Livingcost = ResidenceFee + transportationFee + FoodCost;
            Console.WriteLine("Living Cost is {0:C} (One Semester in Centennial College)", Livingcost);
        }
        public void TotalFee()
        {
            Totalcost = CollegeTuitionFee + BookCost + ResidenceFee + transportationFee + FoodCost;
            Console.WriteLine("\nTotal Cost is {0:C} (One Semester in Centennial College)", Totalcost);
        }

        public void instruction()
        {
            Console.WriteLine("College Living Cost Calculator");
            Console.WriteLine("==============================");
            Console.WriteLine("Academicfees = CollegeTuitionFee + BookCost;");
            Console.WriteLine("Livingcost = ResidenceFee + TransportationFee;\n");
        }

        //Get College fee, Book cost, Residence fee, Transpotation fee,  Food Cost;

        public void setCost(double CollegeTuitionFee, double BookCost, double ResidenceFee, double transportationFee, double FoodCost)
        {
            this.CollegeTuitionFee = CollegeTuitionFee;
            this.BookCost = BookCost;
            this.ResidenceFee = ResidenceFee;
            this.transportationFee = transportationFee;
            this.FoodCost = FoodCost;
        }

        //Get College fee, Book cost, Residence fee, Transpotation fee, Food Cost;
        public double getCollegeTuitionFee()
        {
            return CollegeTuitionFee;
        }
        public double getBookCost()
        {
            return BookCost;
        }
        public double getResidenceFee()
        {
            return ResidenceFee;
        }
        public double gettransportationFee()
        {
            return transportationFee;
        }
        public double getFoodCost()
        {
            return FoodCost;
        }

    }
}