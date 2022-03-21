package com.vijay.learn.SpringBootLearning.service;

import com.vijay.learn.SpringBootLearning.entity.Department;
import com.vijay.learn.SpringBootLearning.error.DepartmentNotFound;

import java.util.List;

/**
 * @author Kumar Vijay
 */
public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> fetchAllDepartment();

    Department getDepartmentById(Long deptId) throws DepartmentNotFound;

    void deleteDepartmentById(Long deptId);

    Department getDepartmentByName(String name);
}
