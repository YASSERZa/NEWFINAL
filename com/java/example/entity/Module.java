package com.java.example.entity;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Table;
import javax.persistence.CascadeType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;




@Entity
@Table(name="Modules")
public class Module {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@ManyToOne
	@JsonIgnore
	 private course course;
	
	 String name;
	
	
	@OneToMany(mappedBy = "module",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Lesson> lessons;

	

	public Module(Integer id, course course, String name, List<Lesson> lessons) {
		this.id = id;
		this.course = course;
		this.name = name;
		this.lessons = lessons;
	}
	
	public Module() {
	
	}
	
	
	
	public Integer getId() {
		return id;
	}
	
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
	public course getCourse() {
		return course;
	}
	
	
	
	public void setCourse(course course) {
		this.course = course;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public List<Lesson> getLessons() {
		return lessons;
	}
	
	
	
	public void setLessons(List<Lesson> lessons) {
		this.lessons = lessons;
	}
	
	
	
}
