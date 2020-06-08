package com.kai.ssm.controller;

import com.kai.ssm.pojo.Employee;
import com.kai.ssm.service.EmployeeService;
import com.kai.ssm.util.JsonMessage;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping(value="/employee",method=RequestMethod.POST)
    @ResponseBody
    public JsonMessage add(Employee e){
        employeeService.add(e);
        JsonMessage json=new JsonMessage();
        json.setStr("添加成功");
        return json;
    }

    @RequestMapping(value="/categories/{id}",method=RequestMethod.DELETE)
    @ResponseBody
    public JsonMessage delete(int id){
        employeeService.delete(id);
        JsonMessage json=new JsonMessage();
        json.setStr("删除成功");
        return json;
    }

    @RequestMapping(value="/categories/{id}",method=RequestMethod.PUT)
    @ResponseBody
    public JsonMessage update(Employee employee){
        employeeService.update(employee);
        JsonMessage json=new JsonMessage();
        json.setStr("修改成功");
        return json;
    }

}
