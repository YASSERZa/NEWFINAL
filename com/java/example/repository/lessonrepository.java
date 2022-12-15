package com.java.example.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.java.example.entity.Lesson;



@Repository
public interface lessonrepository extends JpaRepository<Lesson, Integer>  {

}

