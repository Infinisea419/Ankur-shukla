package com.baeldung.crud.controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.crud.entities.Student;

import com.baeldung.crud.repositories.StudentRepositiory;


@Controller
public class StudentController {
	
	private final StudentRepositiory stuRep;
	
	@Autowired
	public StudentController(StudentRepositiory stuRep) {		
		this.stuRep = stuRep;
	}

	 @GetMapping("/index1")
	    public String showUserList(Model model) {
	        model.addAttribute("students", stuRep.findAll());
	        return "index1";
	    }
	
	 
	
	
	 
	
	@GetMapping("/getStudentDetail")	
	public List<Student> getAllStudents() {
		List<Student> b = (List<Student>) stuRep.findAll();
		return b;
	}
	
	
	  @GetMapping("/signup1")
	  public String showSignUpForm1(Student student) {	  
	  return "add-student1";
	  }
	
	
	@PostMapping("/addStudentDetail")
    public String addUser(@Valid Student student, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-student1";
        }
       stuRep.save(student);
        return "redirect:/index1";
    }
	
	
	/*
	 * @PostMapping("/addStudentDetail") public List<Student>
	 * addAllStudents(@RequestBody List<Student> stu) { List<Student> c =
	 * (List<Student>) stuRep.saveAll(stu); return c; }
	 */
	

}
