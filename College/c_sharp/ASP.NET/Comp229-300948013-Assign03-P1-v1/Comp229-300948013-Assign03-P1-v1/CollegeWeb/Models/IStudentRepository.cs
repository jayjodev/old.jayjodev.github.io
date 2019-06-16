using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CollegeWeb.Models
{
    public interface IStudentRepository
    {
        IQueryable<Student> Students { get; }
        void addStudent(Student student);


    }
}
