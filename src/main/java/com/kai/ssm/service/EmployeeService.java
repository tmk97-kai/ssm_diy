package com.kai.ssm.service;

import com.kai.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> list();
    void add(Employee employee);
    void delete(int id);
    void update(Employee employee);
}
