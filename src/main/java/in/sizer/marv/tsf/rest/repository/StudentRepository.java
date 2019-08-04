package in.sizer.marv.tsf.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.sizer.marv.tsf.rest.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
