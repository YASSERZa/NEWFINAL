package com.java.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.example.entity.Lesson;
import com.java.example.service.lessonservice;



@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/l")
public class lessoncontroller {
    @Autowired
    lessonservice lessonserv;

    
 // Read operation
    @GetMapping
    public List<Lesson> getAllLessons() {
        return lessonserv.getAllLessons();
    }
    
    
 // Create operation
    @PostMapping("/p/{moduleId}")
    public Lesson addLesson(@PathVariable("moduleId") Integer moduleId, @RequestBody Lesson lesson) {
        return lessonserv.addLesson(moduleId, lesson);
    }


 // Delete operation
    
    @DeleteMapping("/d/{id}")
    public String deleteLesson(@PathVariable("id") Integer id) {
    	lessonserv.deleteLessonById(id);
        return "Deleted Successfully";
    }
    
    



}