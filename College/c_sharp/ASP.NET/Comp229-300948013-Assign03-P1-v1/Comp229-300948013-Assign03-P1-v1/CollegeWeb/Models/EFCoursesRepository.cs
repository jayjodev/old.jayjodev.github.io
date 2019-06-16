using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CollegeWeb.Models
{
    public class EFCourseRepository : ICoursesRepository
    {
        private ApplicationDbContext context;
        public EFCourseRepository(ApplicationDbContext ctx)
        {
            context = ctx;
        }
        public IQueryable<Course> Courses => context.Courses;

        public void addCourse(Course course)
        {
            if (course.CourseId == 0)
            {
                context.Courses.Add(course);
            }
            context.SaveChanges();
        }
        public Course GetByCourseId(int id)
        {
            return context.Set<Course>().Find(id);
        }
        public void updateCourse(Course course)
        {
            Course dbEntry = context.Courses.FirstOrDefault(c => c.CourseId == course.CourseId);
            if (dbEntry != null)
            {
                dbEntry.CourseName = course.CourseName;
                dbEntry.Code = course.Code;
                dbEntry.Faculty = course.Faculty;
                dbEntry.Season = course.Season;
            }
            context.SaveChanges();
        }

        public Course deleteCourse(int courseId)
        {
            Course dbEntry = context.Courses.FirstOrDefault(p => p.CourseId == courseId);
            if (dbEntry != null)
            {
                context.Courses.Remove(dbEntry);
                context.SaveChanges();
            }
            return dbEntry;
        }

    }
}