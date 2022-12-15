package com.java.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.example.entity.course;
import com.java.example.repository.courserepository;


@Service
public class courseservice {
	@Autowired
	courserepository courserepo;
	
	
	

	// Read operation
	public List<course> getAllCourse(){
		return (List<course>) courserepo.findAll();
	}
	
	
	

	// Create operation
	public course addCourse(course course) {
		return courserepo.save(course);
		}
	
	
	// Delete operation
		public void deletecourseById(Integer id) {
		courserepo.deleteById(id);
	}
		

		
		// update operation
	public course updatecourse(Integer id,course course) {
		course oldCourse = courserepo.findById(id).get();
		oldCourse.setTitle(course.getTitle());
		oldCourse.setAuthor(course.getAuthor());
		return courserepo.save(oldCourse);
	}
	



}
