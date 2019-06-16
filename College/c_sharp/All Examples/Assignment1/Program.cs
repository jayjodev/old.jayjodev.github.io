using System;

namespace ASSIGNMENT1
{
    // •	Name of the class: Employee.
    class Employee
    {

        // •	3 Instance variables:  empId (integer), empName(string), empSalary(double).
        private int empId;
        private string empName;
        private double empSalary;

        private string empAddress;

        // •	4 overloaded constructors that will allow you to construct (create) 
        //an Employee object with no arguments, 1 argument, 2 arguments, and 3 arguments.
        public Employee()
        {
        }

        public Employee(int empId)
        {
            this.empId = empId;
        }

        public Employee(int empId, string empName)
        {
            this.empId = empId;
            this.empName = empName;

        }

        public Employee(int empId, string empName, double empSalary)
        {
            this.empId = empId;
            this.empName = empName;
            this.empSalary = empSalary;

        }

        //•	1 property EmpAddress (string)

        public string EmpAddress
        {
            get
            {
                return empAddress;
            }
            set
            {
                empAddress = value;
            }

        }

        // • 3 methods that would set the value of the instance variables one at a time.

        public void setId(int empId)
        {
            this.empId = empId;
        }

        public void setName(string empName)
        {
            this.empName = empName;
        }

        public void setSalary(double empSalary)
        {
            this.empSalary = empSalary;
        }

        // • 1 method that would set the values of all 3 instance variable at once.

        public void setInformation(int empId, string empName, double empSalary)
        {
            this.empId = empId;
            this.empName = empName;
            this.empSalary = empSalary;
        }
        // • 3 methods that would get the value of the instance variables one at a time.

        public int getId()
        {
            return empId;
        }

        public string getName()
        {
            return empName;
        }

        public double getSalary()
        {
            return empSalary;
        }

        //•	1 overridden toString() method that will display the string representation of any Employee object.

        public override string ToString()

        {
            return "\nEmployee`s Id: " + empId + "\nEmployee`s Name: " + empName + "\nEmployee`s Salary: " + empSalary;
        }
    }
}
