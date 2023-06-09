package com.UST.JpaManyToMany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="STUDENT_TABLE")
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private int age;
	private String dept;
	
	@ManyToMany(fetch = FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinTable(name="STUDENT_COURSE_TABLE",
	joinColumns= {
			@JoinColumn(name="Student_id",referencedColumnName = "id")
	},
	inverseJoinColumns =  {
			@JoinColumn(name="cource_id",referencedColumnName = "id")
			
	})
	@JsonBackReference
	private Set<Cource> cources;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Set<Cource> getCources() {
		return cources;
	}

	public void setCources(Set<Cource> cources) {
		this.cources = cources;
	}

	public Student(Long id, String name, int age, String dept, Set<Cource> cources) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.cources = cources;
	}
	
	
}
