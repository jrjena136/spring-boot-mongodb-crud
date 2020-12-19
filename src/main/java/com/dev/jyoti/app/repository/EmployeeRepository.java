package com.dev.jyoti.app.repository;

import com.dev.jyoti.app.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    public List<Employee> findByCompanyContaining(String company);
    public Employee findByEmail(String email);
    public List<Employee> findByYearsOfExpBetween(double minExp, double maxExp);

}
