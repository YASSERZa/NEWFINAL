package com.java.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.java.example.entity.course;
import com.java.example.service.courseservice;


@RestController
@CrossOrigin("*")
@RequestMapping("/c")
public class coursecontroller {
	
	
	@Autowired
	courseservice courseserv;
	
	
	// Read operation
	@GetMapping
	public List<course> getAllCourses(){
		return courseserv.getAllCourse();
	}
	
	
	// Create operation
	@PostMapping("/p")
	public course addCourse(@RequestBody course c) {
		return courseserv.addCourse(c);
	
	}
	
	// Delete operation
   @DeleteMapping("/d/{id}")
      public String deletecourseById(@PathVariable("id") Integer id)
    {
    	courseserv.deletecourseById(id);
        return "Deleted Successfully";
    }
   


	 // Update operation
  @PutMapping("/u/{id}")

  public course updatecourses
  (@RequestBody course course, @PathVariable("id") Integer id)
  {
      return courseserv.updatecourse(id, course);
  }
	
	




}
