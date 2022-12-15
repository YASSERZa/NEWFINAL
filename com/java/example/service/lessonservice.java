package com.java.example.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.example.entity.Lesson;
import com.java.example.entity.Module;
import com.java.example.repository.lessonrepository;
import com.java.example.repository.modulerepository;


@Service
public class lessonservice {
	
	
    @Autowired
    lessonrepository lessonrepo;

    @Autowired
    modulerepository modulerepo;

    
    
    public List<Lesson> getAllLessons() {
        return (List<Lesson>) lessonrepo.findAll();
    }

    
    
    @Transactional
    public Lesson addLesson(Integer id, Lesson lesson) {
        java.util.Optional<com.java.example.entity.Module> optionalModule = modulerepo.findById(id);
        if (optionalModule.isPresent()) {
            Module module = optionalModule.get();
            lesson.setModule(module);

            return lessonrepo.save(lesson);
        } else {
            throw new EntityNotFoundException("Module not found with id: " + id);
        }
    }

    
    
    public void deleteLessonById(Integer id) {
        lessonrepo.deleteById(id);
    }
    
    
    
}
