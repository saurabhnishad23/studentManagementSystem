package com.sunny.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sunny.sms.entity.Student;
import com.sunny.sms.repository.StudentRepository;
import com.sunny.sms.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {	
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {		
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentbyId(Long id) {
		studentRepository.deleteById(id);
	}


}
