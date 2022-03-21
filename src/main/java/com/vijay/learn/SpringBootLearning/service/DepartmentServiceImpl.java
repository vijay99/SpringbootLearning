package com.vijay.learn.SpringBootLearning.service;

import com.vijay.learn.SpringBootLearning.entity.Department;
import com.vijay.learn.SpringBootLearning.error.DepartmentNotFound;
import com.vijay.learn.SpringBootLearning.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Kumar Vijay
 */
@Service
@Scope("singleton")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
      return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchAllDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long deptId) throws DepartmentNotFound {
       Optional<Department> departmentOptional= departmentRepository.findById(deptId);
       if(!departmentOptional.isPresent()){
         throw new DepartmentNotFound("Requested department is not found");
       }
       else {
           return departmentOptional.get();
       }
       // return departmentRepository.findById(deptId).get();
    }

    @Override
    public void deleteDepartmentById(Long deptId) {
       departmentRepository.deleteById(deptId);
    }

    @Override
    public Department getDepartmentByName(String name) {
        return departmentRepository.findByDepartmentNameIgnoreCase(name);
    }
}
