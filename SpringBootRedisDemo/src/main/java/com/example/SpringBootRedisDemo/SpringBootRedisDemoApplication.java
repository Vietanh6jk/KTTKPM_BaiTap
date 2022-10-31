package com.example.SpringBootRedisDemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.example.SpringBootRedisDemo.entity.Student;
import com.example.SpringBootRedisDemo.repository.StudentRepository;


@SpringBootApplication
@EnableCaching
public class SpringBootRedisDemoApplication implements CommandLineRunner{
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	private StudentRepository studentRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRedisDemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		LOG.info("Saving users. Current user count is {}.", studentRepository.count());
	    Student Anh = new Student("191","Anh","MALE",1);

	    studentRepository.save(Anh);
	    LOG.info("Done saving users. Data: {}.", studentRepository.findAll());
	    System.out.println(studentRepository.findById(Anh.getId()).get().toString());
	}

}
