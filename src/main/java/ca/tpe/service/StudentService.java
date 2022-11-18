package ca.tpe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.tpe.data.StudentRepositoty;
import ca.tpe.model.Student;

@Service
public class StudentService {
	
	@Autowired
	private final StudentRepositoty studentRepository;
	
	
	public StudentService(StudentRepositoty studentRepository) {
		this.studentRepository = studentRepository;
	}


	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	public void addNewStudent(Student student) {
		studentRepository.save(student);
	}
}
