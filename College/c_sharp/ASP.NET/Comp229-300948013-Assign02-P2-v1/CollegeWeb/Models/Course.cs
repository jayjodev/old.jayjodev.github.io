using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;

namespace CollegeWeb.Models
{
    public class Course
    {
        public string Courses { get; set; }

        [Required(ErrorMessage = "Please enter your first name")]
        public string FirstName { get; set; }

        [Required(ErrorMessage = "Please enter your last name")]
        public string LastName { get; set; }

        [Required(ErrorMessage = "Please enter your e-mail address")]
        public string Email { get; set; }

        [Required(ErrorMessage = "Please enter your phone address")]
        public string Phone { get; set; }

        [Required(ErrorMessage = "Please enter your student number")]
        public string StudentNumber { get; set; }

        [Required(ErrorMessage = "Please enter password")]
        public string Password { get; set; }


    }
}
