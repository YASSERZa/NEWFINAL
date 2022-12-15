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

import com.java.example.entity.Module;
import com.java.example.service.moduleservice;

@RestController
@CrossOrigin(origins = {"*"})
@RequestMapping("/m")
public class modulecontroller {
    @Autowired
    moduleservice moduleserv;

    
    
 // Read operation
    @GetMapping
    public List<Module> getAllmodules() {
        return moduleserv.getAllModules();
    }
    
    
 // Create operation
    @PostMapping("/p/course/{courseId}")
    public Module addModule(@PathVariable("courseId") Integer courseId, @RequestBody Module module) {
        return moduleserv.addModule(courseId, module);
    }

    
    // Delete operation
    
    @DeleteMapping("/d/{id}")
    public String deleteModulebyId(@PathVariable("id")Integer id) 
        {
    	
        moduleserv.deleteModuleById(id);
        return "Deleted Successfully";
    }

  

	 // Update operation
 @PutMapping("/u/courses/{id}")

 public Module updatemodules
 (@PathVariable("id") Integer id,@RequestBody Module module )
 {
     return moduleserv.updateModule(id, module);
 }
 
}
