package com.piyush.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="department_table")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "department_Id")
	private int id;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@Column(name ="location")
	private String departmentLocation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentLocation() {
		return departmentLocation;
	}

	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}

	public Department(int id, String departmentName, String departmentLocation) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
	}

	public Department() {
		super();
	}	

}
