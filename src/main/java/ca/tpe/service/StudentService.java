package ca.tpe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.tpe.data.IStudentRepositoty;
import ca.tpe.model.Student;

@Service
public class StudentService {
	@Autowired
	private final IStudentRepositoty studentRepository;
		
	public StudentService(IStudentRepositoty studentRepository) {
		this.studentRepository = studentRepository;
	}


	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
}
