package com.java.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.example.entity.course;



@Repository
public interface courserepository extends JpaRepository<course, Integer> {

}
