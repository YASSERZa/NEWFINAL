package com.java.example.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="lessons")
public class Lesson {
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 Integer id;
	 String title;


	@ManyToOne
	@JsonIgnore
	private Module module;
	
	public Lesson() {	
	}
	
	
	public Lesson(Integer id, String title) {
		this.id = id;
		this.title = title;
	}
	
	
	public Integer getId() {
		return id;
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getTitle() {
		return title;
	}
	
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	public Module getModule() {
		return module;
	}
	
	
	public void setModule(Module module) {
		this.module = module;
	}
	

	
	
	
}
