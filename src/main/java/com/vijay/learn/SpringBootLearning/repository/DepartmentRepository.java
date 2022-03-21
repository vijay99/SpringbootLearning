package com.vijay.learn.SpringBootLearning.repository;

import com.vijay.learn.SpringBootLearning.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kumar Vijay
 */
@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    public Department findByDepartmentNameIgnoreCase(String name);
}
