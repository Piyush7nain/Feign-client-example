package com.piyush.Services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.piyush.Repo.DepartmentRepository;
import com.piyush.models.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	private DepartmentRepository repository;

	public DepartmentServiceImpl(DepartmentRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	@Transactional
	public Iterable<Department> getAllDepartments() {
		
		return repository.findAll();
	}

	@Override
	@Transactional
	public Department getDepartmentById(int id) {
		
		return repository.findById(id).get();
	}
	
	

}
