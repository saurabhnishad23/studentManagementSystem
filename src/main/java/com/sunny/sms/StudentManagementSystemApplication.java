package com.sunny.sms;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.sunny.sms.entity.Student;
//import com.sunny.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
//	@Autowired
//	private StudentRepository studentRepository;
	
	public void run(String... args)throws Exception{
		/*
		Student stu1 = new Student("Ramesh", "kumar", "ramesh@gmail.com") ;
		studentRepository.save(stu1);
		
		Student stu2 = new Student("Suresh", "kumar", "suresh@gmail.com") ;
		studentRepository.save(stu2);
		
		Student stu3 = new Student("Paresh", "kumar", "Paresh@gmail.com") ;
		studentRepository.save(stu3);
	*/

	}

}
