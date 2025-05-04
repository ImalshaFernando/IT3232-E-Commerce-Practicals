package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import java.util.List; 

@Entity
public class Employee extends Person{
	private String jobPosition;

    @ManyToMany
    private List<Canteen> canteens;

	public String getJobPosition() {
		return jobPosition;
	}

	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}
}
