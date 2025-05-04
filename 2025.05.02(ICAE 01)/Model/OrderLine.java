package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderLine {
	@Id
		private int id;
	    private int quantity;
	    @ManyToOne
	    private FoodOrder foodOrder;
	    @ManyToOne
	    private Food food;
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
}
