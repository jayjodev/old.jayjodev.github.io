using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CollegeWeb.Models
{
    public interface ICoursesRepository
    {
        IQueryable<Course> Courses { get; }

        void addCourse(Course course);
        void updateCourse(Course course);
        Course deleteCourse(int courseId);
        Course GetByCourseId(int id);


    }
}
