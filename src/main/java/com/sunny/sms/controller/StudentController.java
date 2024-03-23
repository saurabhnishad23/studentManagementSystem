package com.sunny.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sunny.sms.entity.Student;
import com.sunny.sms.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
//	public StudentController(StudentService studentService) {
//		super();
//		this.studentService = studentService;
//	}
	
	@GetMapping("/students")
	public String listStudents(Model model ) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		//create stu object to hold stu form data
		Student student = new Student();
		model.addAttribute("student", student);
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
		//get student from db by id
		Student existingStu = studentService.getStudentById(id);
		existingStu.setId(id);
		existingStu.setFirstName(student.getFirstName());
		existingStu.setLastName(student.getLastName());
		existingStu.setEmail(student.getEmail());
		
		studentService.updateStudent(existingStu);
		return "redirect:/students";
	}
	
	//handler method to delete student req
	@GetMapping("/students/{id}")
	public  String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentbyId(id);
		return "redirect:/students";
	}
	
}
