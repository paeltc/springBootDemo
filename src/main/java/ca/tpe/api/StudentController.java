package ca.tpe.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.tpe.model.Student;
import ca.tpe.service.StudentService;

@RequestMapping(path = "api/v1/student")
@RestController
public class StudentController {
	
	@Autowired
	private final StudentService studentService;	
		
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
}
