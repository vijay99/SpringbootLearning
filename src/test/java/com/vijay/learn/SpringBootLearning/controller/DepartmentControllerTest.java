//package com.vijay.learn.SpringBootLearning.controller;
//
//import com.vijay.learn.SpringBootLearning.entity.Department;
//import com.vijay.learn.SpringBootLearning.service.DepartmentService;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//
//import java.awt.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
///**
// * @author Kumar Vijay
// */
//@WebMvcTest(DepartmentController.class)
//class DepartmentControllerTest {
//
//    @MockBean
//    private DepartmentService departmentService;
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    private Department department;
//
//    @BeforeEach
//    void setUp() {
//        department = Department.builder().departmentName("Film").departmentCode("667").departmentAddress("Ghorkpur").departmentId(900L).build();
//    }
//
//    @Test
//    public void saveDepartment(){
//       Department inputDepartment = Department.builder().departmentName("Film").departmentCode("667").departmentAddress("Ghorkpur").build();
//        Mockito.when(departmentService.saveDepartment(inputDepartment)).thenReturn(department);
//        mockMvc.perform(MockMvcRequestBuilders.post(urlTemplate:"/departments")
//        .contentType(PageAttributes.MediaType.Appl)
//    }
//
//    @Test
//    public void fetchDepartmentById(){
//
//    }
//}