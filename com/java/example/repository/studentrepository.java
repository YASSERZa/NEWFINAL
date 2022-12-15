package com.java.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.java.example.entity.Student;

@Repository
public interface studentrepository extends JpaRepository<Student, Integer>  {

}
