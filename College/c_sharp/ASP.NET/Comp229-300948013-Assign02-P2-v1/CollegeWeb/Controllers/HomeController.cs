using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc;
using CollegeWeb.Models;

namespace CollegeWeb.Controllers
{
    public class HomeController : Controller
    {
        public ViewResult Index()
        {
            return View("Home");
        }

        [HttpGet]
        public ViewResult InsertPage()

        {
            return View();
        }

        [HttpPost]
        public ViewResult InsertPage(Course Data)
        {
            if (ModelState.IsValid)
            {
                Repository.AddResponse(Data);
                return View("DisplayPage", Data);
            }
            else {
                // there is a validation error
                return View();
            }
        }

        public ViewResult DisplayPage()
        {
            return View();
        }

        public ViewResult DataPage()
        {
            return View(Repository.Responses);
        }

        public ViewResult UserPage()

        {
            return View();
        }
    }
}