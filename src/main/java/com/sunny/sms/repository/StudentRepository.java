package com.sunny.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunny.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
