package com.vijay.learn.SpringBootLearning.service;

import com.vijay.learn.SpringBootLearning.entity.Department;
import com.vijay.learn.SpringBootLearning.error.DepartmentNotFound;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Kumar Vijay
 */
@Service
public class ITDepartmentServiceImpl implements DepartmentService{
    @Override
    public Department saveDepartment(Department department) {
        return null;
    }

    @Override
    public List<Department> fetchAllDepartment() {
        return null;
    }

    @Override
    public Department getDepartmentById(Long deptId) throws DepartmentNotFound {
        return null;
    }

    @Override
    public void deleteDepartmentById(Long deptId) {

    }

    @Override
    public Department getDepartmentByName(String name) {
        return null;
    }
}
