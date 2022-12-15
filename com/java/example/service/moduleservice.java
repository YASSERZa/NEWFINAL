package com.java.example.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.example.entity.Module;
import com.java.example.entity.course;
import com.java.example.repository.courserepository;
import com.java.example.repository.modulerepository;

@Service
public class moduleservice {
	@Autowired
	modulerepository modulerepo;
	
	@Autowired
	courserepository courserepo;
	
	
	public List<Module> getAllModules() {
		return (List<Module>) modulerepo.findAll();
	}
	
	@Transactional
	public Module addModule(Integer id,Module module) {
	    Optional<course> optionalCourse = courserepo.findById(id);
	    if (optionalCourse.isPresent()) {
	        course course = optionalCourse.get();
	        module.setCourse(course);

	        return modulerepo.save(module);
	    } else {
	        throw new EntityNotFoundException("Course not found with id: " + id);
	    }
	}
	
	public void deleteModuleById(Integer id) {
		modulerepo.deleteById(id);
	}
	
	
	// update operation
		public Module updateModule(Integer id,Module module) {
			Module oldModule = modulerepo.findById(id).get();
			oldModule.setName(module.getName());
			return modulerepo.save(oldModule);
		}

	
}
