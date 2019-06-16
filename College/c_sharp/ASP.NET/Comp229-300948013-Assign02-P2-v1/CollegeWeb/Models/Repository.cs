using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace CollegeWeb.Models
{
    public static class Repository
    {
        private static List<Course> responses = new List<Course>();

        public static IEnumerable<Course> Responses
        {
            get
            {
                return responses;
            }
        }
        public static void AddResponse(Course response)
        {
            responses.Add(response);
        }

    }
}
