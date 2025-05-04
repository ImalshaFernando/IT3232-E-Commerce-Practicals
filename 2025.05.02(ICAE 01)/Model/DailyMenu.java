package com.example.demo.Model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class DailyMenu {
	@Id
	 private Long id;
	    private LocalDate date;
	    @ManyToOne
	    private Canteen canteen;

	    @ManyToMany
	    private List<Food> foods;

	    
		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}
}
