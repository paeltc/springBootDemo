package ca.tpe.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.tpe.model.Student;
import ca.tpe.service.StudentService;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
	
	private final StudentService studentService;	
	
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping(path = "api/v1/all")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
}
