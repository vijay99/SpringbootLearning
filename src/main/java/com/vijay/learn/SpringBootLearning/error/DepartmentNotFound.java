package com.vijay.learn.SpringBootLearning.error;

/**
 * @author Kumar Vijay
 */
public class DepartmentNotFound extends Exception{

    public DepartmentNotFound(String errorMessage) {
        super(errorMessage);
    }
}
