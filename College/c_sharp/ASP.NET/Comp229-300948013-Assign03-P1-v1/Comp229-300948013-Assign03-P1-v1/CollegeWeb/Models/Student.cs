using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;


namespace CollegeWeb.Models
{
    public class Student
    {
        [Required(ErrorMessage = "Please enter Student ID")]
        public int StudentID { get; set; }

        [Required(ErrorMessage = "Please enter Student Name")]
        public string Name { get; set; }

        [Required(ErrorMessage = "Please enter Phone Number")]
        public string Phone { get; set; }

        [Required(ErrorMessage = "Please enter Course Id")]
        public int CourseId { get; set; }
    }
}
