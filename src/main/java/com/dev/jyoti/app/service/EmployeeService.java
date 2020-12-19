package com.dev.jyoti.app.service;

import com.dev.jyoti.app.model.Employee;
import com.dev.jyoti.app.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(id).get();
    }

    public Employee getEmployeeByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    public List<Employee> getEmployeeByMatchingCompany(String company) {
        return employeeRepository.findByCompanyContaining(company);
    }
}
