package com.dev.jyoti.app.controller;

import com.dev.jyoti.app.model.Employee;
import com.dev.jyoti.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3030")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee emp) {
        return employeeService.createEmployee(emp);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathParam("id") String id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/employee/{email}")
    public Employee getEmployeeByEmail(@PathParam("email") String email) {
        return employeeService.getEmployeeByEmail(email);
    }

    @GetMapping("/employees/company")
    public List<Employee> getAllEmployeeMatchingCompany(@RequestParam String company) {
        return employeeService.getEmployeeByMatchingCompany(company);
    }
}
