package com.company.controller;


import com.company.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/student")
public class StudentController {


        //localhost:8080/student/register
        @RequestMapping(value= "/register", method = RequestMethod.POST  )
        @GetMapping("/register")
        public String register(Model model ){

            model.addAttribute("students", DataGenerator.createStudent());


            return "student/register";
        }

        //localhost:8080/student/welcome
        @RequestMapping( "/welcome")
        @PostMapping("/welcome")
        public String welcome(@RequestParam String make){


            return "student/welcome";
        }
}
