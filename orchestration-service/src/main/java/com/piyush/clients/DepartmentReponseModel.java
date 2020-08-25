package com.piyush.clients;

public class DepartmentReponseModel {
	
	private int id;
	private String departmentName;
	private String departmentLocation;
	public DepartmentReponseModel() {
		super();
	}
	public DepartmentReponseModel(int id, String departmentName, String departmentLocation) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentLocation = departmentLocation;
	}
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
	
	

}
