package edu.monmouth.eats.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.monmouth.eats.entities.Student;

@Controller
@RequestMapping("students")
public class StudentController {
	
	@GetMapping("/new")
	public String addStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "studentForm";
	}

}
