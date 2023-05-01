package com.UST.JpaManyToMany.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UST.JpaManyToMany.entity.Student;

public interface Studentrepository extends JpaRepository<Student, Long>{
//
//	Student findByNameContaining(String name);

}
