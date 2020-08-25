package com.piyush.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.piyush.models.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

}
