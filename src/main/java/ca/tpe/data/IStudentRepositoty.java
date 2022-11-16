package ca.tpe.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ca.tpe.model.Student;

@Repository
public interface IStudentRepositoty extends JpaRepository<Student, Long>{

}
