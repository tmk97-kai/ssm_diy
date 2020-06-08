package com.kai.ssm.mapper;

import com.kai.ssm.pojo.Employee;

import java.util.List;

public interface EmployeeMapper {
    public List<Employee> list();
    public void add(Employee employee);
    public void delete(int id);
    public void update(Employee employee);
}
