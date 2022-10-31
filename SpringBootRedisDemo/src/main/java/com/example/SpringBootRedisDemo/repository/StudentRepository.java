package com.example.SpringBootRedisDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootRedisDemo.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String>{
}
