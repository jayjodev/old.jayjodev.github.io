using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace JoLabTest1
{
    class JoLabTest1
    {

        private string stName;
        private double stdGrade;
        public JoLabTest1()
        {

        }
        public JoLabTest1(string stName, double stdGrade)
        {
            this.stName = stName;
            this.stdGrade = stdGrade;
        }

        //  1 auto implemented property
        public int StId
        {
            get;
            set;
        }

        // set Method
        public void setStudentName(string stName)
        {
            this.stName = stName;
        }

        public void setStudentGrade(double stdGrade)
        {
            this.stdGrade = stdGrade;
        }

        // get Method
        public string getStudentName()
        {
            return stName;
        }

        public double getStudentgrade()
        {
            return stdGrade;
        }

        public override string ToString()
        {
            return "\nStudent1:\n" + "Name: " + stName + "\nStudent ID: " + StId + ";" + "\nGrade Recevied: " + stdGrade;
        }

        static void Main(string[] args)
        {
            JoLabTest1 std1 = new JoLabTest1();

            std1.setStudentName("Syed");
            std1.setStudentGrade(90);
            std1.StId = 10000;


            JoLabTest1 std2 = new JoLabTest1("John", 88);
            std2.StId = 20000;

            Console.WriteLine(std1);
            Console.WriteLine(std2);

            Console.ReadKey();
        }
    }
}
