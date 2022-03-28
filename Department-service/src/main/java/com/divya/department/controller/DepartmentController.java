package com.divya.department.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divya.department.entity.Department;
import com.divya.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentService service;

	@PostMapping("/save")
	public Department save(@RequestBody Department department) {
		return service.save(department);

	}

	@GetMapping("/findAll")
	public List<Department> findAll() {
		return service.findAll();
	}

	@GetMapping("/{id}")
	public Department findById(@PathVariable int id) {
		return service.findById(id);

	}

}
