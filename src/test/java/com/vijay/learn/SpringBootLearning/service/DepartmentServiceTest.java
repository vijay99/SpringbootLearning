package com.vijay.learn.SpringBootLearning.service;

import com.vijay.learn.SpringBootLearning.entity.Department;
import com.vijay.learn.SpringBootLearning.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Kumar Vijay
 */
@SpringBootTest
class DepartmentServiceTest {

    @Autowired
    @Qualifier("departmentServiceImpl")
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department department =
                Department.builder().departmentId(10L)
                                     .departmentName("IT")
                                    .departmentAddress("Ranchi")
                                    .departmentCode("007").build();
        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(department);
    }

    @Test
    @DisplayName("Get Data based on valid department name")
    public void whenValidDepartmentName_thenDepartmentShouldFound(){
        String departmentName = "IT";

        Department found= departmentService.getDepartmentByName(departmentName);
        assertEquals(departmentName,found.getDepartmentName());

    }
}