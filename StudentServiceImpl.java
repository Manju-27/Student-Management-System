package com.example.demo.service.impl;
import java.util.List;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.stereotype.Service;
import com.example.demo.repository.StudentRepository;


@Service
public class StudentServiceImpl implements StudentService {
	
	
private StudentRepository studentRepository;	

	
	

public StudentServiceImpl(StudentRepository studentRepository) {
	super();
	this.studentRepository = studentRepository;
}


@Override
public List<Student> getAllStudents(){
	// to do auto -generated method stub
	return studentRepository.findAll();
}
@Override

public Student saveStudent(Student student) {
	return studentRepository.save(student);
}

@Override
 public Student getStudentById(Long id){
	 return studentRepository.findById(id).get();
 }
@Override
 public Student updateStudent(Student student) {
	 return studentRepository.save(student); 
 }

@Override
 public void deleteStudentById(Long id) {
	studentRepository.deleteById(id); 	
}

}







