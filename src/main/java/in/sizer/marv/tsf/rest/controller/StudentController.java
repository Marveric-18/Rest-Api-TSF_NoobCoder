package in.sizer.marv.tsf.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.sizer.marv.tsf.rest.dao.StudentDAO;
import in.sizer.marv.tsf.rest.model.Student;


//controller will call the DAO object
@RestController
@RequestMapping("/studentinfo")
public class StudentController {

	@Autowired
	StudentDAO studentDAO;
	
	/*	CURD OPERATION	*/
	

	//Save A Student 
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		//@Valid @RequestBody
//		System.out.println(student);
		return studentDAO.save(student);
//		return null;
		//ok
	}
	
	//get all Students
	@GetMapping("/students")
	public List<Student> getAllStudent(){
		return studentDAO.findAll();
		
		
	}
	
	//get one Student by Enrollment_Id
	@GetMapping("/students/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable(value="id") Long enroll_Id){
		
		Student student=studentDAO.findOne(enroll_Id);
		
		if(student==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(student);
		
	}
	
	//update one student by Enrollment_Id
	@PutMapping("/students/{id}")public ResponseEntity<Student> updateStudent
						(@PathVariable(value="id") Long enroll_Id,
						@Valid @RequestBody Student studentDetail){
		
		//check if the student is there or not
		Student student=studentDAO.findOne(enroll_Id);
		
		if(student==null) {
			return ResponseEntity.notFound().build();
		}
		
		student.setDepartment(studentDetail.getDepartment());
		student.setCity(studentDetail.getCity());
		student.setPinCode(studentDetail.getPinCode());
		
		Student updatedStudent = studentDAO.save(student);
		return ResponseEntity.ok().body(updatedStudent);
		
	}
	
	//delete student
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Student> deleteStudent(@PathVariable(value="id") Long enroll_Id){
		
		//check if the student is there or not
		Student student=studentDAO.findOne(enroll_Id);
		if(student==null) {//if not found
			return ResponseEntity.notFound().build();
		}
		studentDAO.removeOne(student);
		return ResponseEntity.ok().build();
	
	}
	
}
