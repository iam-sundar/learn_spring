package com.st.spring_Javax_demo.service;

import com.st.spring_Javax_demo.bean.Employee;

import javax.inject.Named;
import java.util.Arrays;
import java.util.List;

@Named
public class EmployeeService {

    public List<Employee> getEmployees(){
        return Arrays.asList(
                new Employee("Sundar",30),
                new Employee("Suganya",30)
        );
    }
}