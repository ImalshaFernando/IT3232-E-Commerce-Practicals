package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import java.util.List; 

@Entity
public class Canteen {
	 @Id
	    private int id;
	    private String name;
	    private String location;

	    @OneToMany(mappedBy = "canteen")
	    private List<DailyMenu> dailyMenus;

	    @ManyToMany(mappedBy = "canteens")
	    private List<Employee> employees;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}
	}

