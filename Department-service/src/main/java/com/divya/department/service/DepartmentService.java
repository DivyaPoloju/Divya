package com.divya.department.service;

import java.util.List;

import com.divya.department.entity.Department;

public interface DepartmentService {
	
	public Department save(Department department);
	public List<Department> findAll();
	public Department findById(int id);

}
