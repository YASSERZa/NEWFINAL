package com.java.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.java.example.entity.Module;

@Repository
public interface modulerepository extends JpaRepository<Module, Integer> {

	

}

