package com.vijay.learn.SpringBootLearning.controller;

import com.vijay.learn.SpringBootLearning.entity.Department;
import com.vijay.learn.SpringBootLearning.error.DepartmentNotFound;
import com.vijay.learn.SpringBootLearning.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Kumar Vijay
 */
@RestController
public class DepartmentController {
    @Autowired
    @Qualifier("departmentServiceImpl")
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside DepartmentController saveDepartment() method");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchAllDepartment(){
        LOGGER.info("Inside DepartmentController fetchAllDepartment() method");
        return departmentService.fetchAllDepartment();
    }

    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long deptId) throws DepartmentNotFound {
        LOGGER.info("Inside DepartmentController getDepartmentById() method");
        return departmentService.getDepartmentById(deptId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long deptId){
        LOGGER.info("Inside DepartmentController deleteDepartmentById() method");
        departmentService.deleteDepartmentById(deptId);
        return "Deleted department successfully!!";

    }
    @GetMapping("/departments/name/{name}")
    public Department getDepartmentByName(@PathVariable("name") String name){
        LOGGER.info("Inside DepartmentController getDepartmentByName() method");
        return departmentService.getDepartmentByName(name);
    }
}
