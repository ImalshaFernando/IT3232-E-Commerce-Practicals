package com.example.demo.Model;

import java.time.LocalDate;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class FoodOrder {
	@Id
	private int id;
    private LocalDate orderDate;

    @ManyToOne
    private Student student;

    @OneToMany(mappedBy = "foodOrder")
    private List<OrderLine> orderLines;

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
}
