package com.piyush.Services;

import com.piyush.models.Department;

public interface DepartmentService {

	Iterable<Department> getAllDepartments();

	Department getDepartmentById(int id);

}
