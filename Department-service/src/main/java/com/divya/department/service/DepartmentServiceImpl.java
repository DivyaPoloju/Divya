package com.divya.department.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divya.department.entity.Department;
import com.divya.department.repository.DepartmentRepo;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	DepartmentRepo deptRepo;
	
	@Override
	public Department save(Department department)
	{
		return deptRepo.save(department);
	}
	
	@Override
	public List<Department> findAll()
	{
		return deptRepo.findAll();
	}
	
	@Override
	public Department findById(int id)
	{
		
		Optional<Department> op=deptRepo.findById(id);
		if(op.isPresent())
		{
			return op.get();
		}
		else
		{
			return null;
		}
	}
	

}
