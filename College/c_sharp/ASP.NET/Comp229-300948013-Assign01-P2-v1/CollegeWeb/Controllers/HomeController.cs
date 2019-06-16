using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;

namespace CollegeWeb.Controllers
{
    public class HomeController : Controller
    {
        public ViewResult Index()
        {
            return View("Home");
        }
        public ViewResult DataPage()
        {
            return View();
        }
        public ViewResult DisplayPage()
        {
            return View();
        }
        public ViewResult InsertPage()

        {
            return View();
        }
        public ViewResult UserPage()

        {
            return View();
        }
    }
}