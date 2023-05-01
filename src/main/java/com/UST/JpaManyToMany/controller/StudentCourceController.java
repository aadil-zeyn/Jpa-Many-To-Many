package com.UST.JpaManyToMany.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UST.JpaManyToMany.entity.Cource;
import com.UST.JpaManyToMany.entity.Student;
import com.UST.JpaManyToMany.repo.Courserepository;
import com.UST.JpaManyToMany.repo.Studentrepository;



@RestController
@RequestMapping("/student-cource")
public class StudentCourceController {
	@Autowired
	private Studentrepository studentrepository;
	@Autowired
	private Courserepository courcerepo;
	
	@PostMapping("/add")
	public Student saveStudentWithCource(@RequestBody Student student) {
		return studentrepository.save(student);
	}
	@PostMapping("/addc")
	public Cource saveStudenWithCource(@RequestBody Cource student) {
		return courcerepo.save(student);
	}
	@GetMapping("/students")
	public List<Student> findAllStudent(){
		return studentrepository.findAll();	}
//	@GetMapping("/{studentid}")
//	public Student findStudent(@PathVariable Long studentid) {
//		return studentrepository.findById(studentid).orElse(null);
//	}
//	@GetMapping("/find/{name}")
//	public Student findStudentByName(@PathVariable String name) {
//		return studentrepository.findByNameContaining(name);
//	}
//	@GetMapping("/search/{price}")
//	public List<Cource> findCourcelessthanprice(@PathVariable double price){
//		return courcerepo.findCourcelessthanprice(price);
//	}
}
