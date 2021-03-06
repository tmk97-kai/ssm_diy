package com.kai.ssm.service.impl;

import com.kai.ssm.mapper.EmployeeMapper;
import com.kai.ssm.pojo.Employee;
import com.kai.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;
    public List<Employee> list(){
        return employeeMapper.list();
    }
    public void add(Employee employee){
        employeeMapper.add(employee);
    }
    public void delete(int id){
        employeeMapper.delete(id);
    }
    public void update(Employee employee){
        employeeMapper.update(employee);
    }
}
