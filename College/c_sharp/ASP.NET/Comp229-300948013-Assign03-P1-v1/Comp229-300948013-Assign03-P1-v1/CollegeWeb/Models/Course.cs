using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;

namespace CollegeWeb.Models
{
    public class Course
    {
        public int CourseId { get; set; }

        [Required(ErrorMessage = "Please enter Course Name")]
        public string CourseName { get; set; }
        [Required(ErrorMessage = "Please enter Course Code")]
        public string Code { get; set; }
        [Required(ErrorMessage = "Please enter Faculty")]
        public string Faculty { get; set; }
        
        public string Season { get; set; }

        public List<Student> Students { get; set; }

    }
}
