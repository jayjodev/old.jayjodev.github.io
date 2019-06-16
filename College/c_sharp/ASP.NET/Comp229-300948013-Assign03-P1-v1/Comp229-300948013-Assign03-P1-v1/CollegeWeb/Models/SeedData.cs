using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.EntityFrameworkCore;

namespace CollegeWeb.Models
{
    public static class SeedData
    {
        public static void EnsurePopulated(IApplicationBuilder app)
        {
            ApplicationDbContext context = app.ApplicationServices.GetRequiredService<ApplicationDbContext>();
            context.Database.Migrate();
            if (!context.Courses.Any())
            {
                context.Courses.AddRange(
                    new Course
                    {
                        CourseName = "ASP.NET",
                        Code = "COMP209",
                        Faculty = "JAKE",
                        Season = "Fall",
                    },
                    new Course
                    {
                        CourseName = "JavaProgramming",
                        Code = "COMP109",
                        Faculty = "Viji",
                        Season = "Winter",
                    }
                    );
                context.SaveChanges();
            }
        }
    }
}
