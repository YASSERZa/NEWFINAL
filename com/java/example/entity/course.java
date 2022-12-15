package com.java.example.entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
@Table(name="Courses")
public class course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String author;

    
	@OneToMany(mappedBy = "course",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Module> modules;
    
    public course() {
    	
    	
    }
    
    public course(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    
    public int getId() {
        return id;
    }
    
    
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    
    
    public String getAuthor() {
        return author;
    }
    
    
    
    public void setAuthor(String author) {
        this.author = author;
    }

    
	public List<Module> getModules() {
		return modules;
	}
	
	

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	
	
	public void setId(int id) {
		this.id = id;
	}
    
    
    
}


	


