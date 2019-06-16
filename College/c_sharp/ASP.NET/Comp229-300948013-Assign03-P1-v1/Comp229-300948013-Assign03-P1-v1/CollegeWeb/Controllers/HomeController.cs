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
        private ICoursesRepository repository;
        private IStudentRepository studentrepository;

        public HomeController(ICoursesRepository repo)
        {
            repository = repo;
        }

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
                Course course = repository.Courses.FirstOrDefault();
                if (Data.CourseId == 0)
                {
                    repository.addCourse(Data);
                    return View("DataPage", Data);
                }
                else
                {
                    return View();
                }
            }
            else
            {
                // there is a validation error
                return View();
            }
        }

        public ViewResult DisplayPage()
            => View(repository.Courses
                .OrderBy(p => p.CourseId));
        [HttpPost]
        public ActionResult DataPage(int id)
        {
            var result = repository.Courses.FirstOrDefault(r => r.CourseId == id);
            return View(result);
        }

        public ViewResult Update(int id)
        {
            var result = repository.Courses.FirstOrDefault(r => r.CourseId == id);
            return View(result);
        }

        [HttpPost]
        public IActionResult Update(Course course)
        {
            if (ModelState.IsValid)
            {
                repository.addCourse(course);
                TempData["Message"] = $"{course.CourseName} has been saved";
                return RedirectToAction("Greet");
            }
            else
                return View(course);
        }
        [HttpPost]
        public IActionResult Delete(int courseId)
        {
            Course DeleteCourse = repository.deleteCourse(courseId);
            if (DeleteCourse != null)
            {
                TempData["Message"] = $"{DeleteCourse.CourseName} was deleted";
            }

            return RedirectToAction("Index");
        }

        [HttpGet]
        public ViewResult AddStudent()

        {
            return View();
        }


        [HttpPost]
        public ViewResult AddStudent(Student Data)
        {
            if (ModelState.IsValid)
            {
                Student course = studentrepository.Students.FirstOrDefault();
                if (Data.StudentID == 0)
                {
                    studentrepository.addStudent(Data);
                    return View("UserPage", Data);
                }
                else
                {
                    return View();
                }
            }
            else
            {
                // there is a validation error
                return View();
            }
        }

        public ViewResult UserPage()
        {
            return View();
        }
       
        public ViewResult Greet()
        {
            return View();
        }
    }
}