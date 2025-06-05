package lk.ac.vau.fas.ict.model;

import java.sql.Date;

public class ViewDepartment extends Department {
	private int empcount;

	
	public ViewDepartment() {
		
	}

	public ViewDepartment(String id, String depName, Date established, int employees) {
		super(id,depName,established);
		this.empcount = employees;
	}

	public int getEmpcount() {
		return empcount;
	}

	public void setEmpcount(int empcount) {
		this.empcount = empcount;
	}
	
	
}
