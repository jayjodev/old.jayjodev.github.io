using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CollegeWeb.Models
{
    public class EFStudentRepository
    {
        private ApplicationDbContext context;

        public void addStudent(Student student)
        {
            if (student.StudentID == 0)
            {
                context.Students.Add(student);
            }
            context.SaveChanges();
        }

    }
}
