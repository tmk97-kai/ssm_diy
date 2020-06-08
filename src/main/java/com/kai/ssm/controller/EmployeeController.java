package com.kai.ssm.controller;

import com.kai.ssm.pojo.Employee;
import com.kai.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("")
public class EmployeeController{
    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value="/employee",method= RequestMethod.GET)
    public String list(Model model){
        List<Employee> cs=employeeService.list();
        model.addAttribute("cs",cs);
        return "listEmployee";
    }

}
