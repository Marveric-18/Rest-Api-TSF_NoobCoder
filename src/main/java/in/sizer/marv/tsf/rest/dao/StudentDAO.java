package in.sizer.marv.tsf.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sizer.marv.tsf.rest.model.Student;
import in.sizer.marv.tsf.rest.repository.StudentRepository;

//Data Access Object
@Service
public class StudentDAO {
	
	@Autowired
	StudentRepository studentRepository;
	
	
	
	
	//insert Student Detail
	
	public Student save(Student student) {
		
		return studentRepository.save(student);
		
	}
	
	//search all Student
	
	public List<Student> findAll(){
		
		return studentRepository.findAll();
		
	}
	
	//search one Student
	
	public Student findOne(Long Enroll_id) {
		
		return studentRepository.findOne(Enroll_id);
		
	}
	
	
	//delete Student Detail
	public void removeOne(Student student) {
		
		studentRepository.delete(student);
		
	}
	
	
	
	
	
}
