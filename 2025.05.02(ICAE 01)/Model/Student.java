package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity

public class Student extends Person{
	private String academicDegree;

    @OneToMany(mappedBy = "student")
    private List<FoodOrder> orders;

	public String getAcademicDegree() {
		return academicDegree;
	}

	public void setAcademicDegree(String academicDegree) {
		this.academicDegree = academicDegree;
	}
}

