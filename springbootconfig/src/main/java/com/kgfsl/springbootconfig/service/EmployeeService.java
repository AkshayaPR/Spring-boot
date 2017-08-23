package com.kgfsl.springbootconfig.service;
import com.kgfsl.springbootconfig.model.Employee;
import java.util.List;

public interface EmployeeService {
    public Employee save(Employee employee);
    public List<Employee> getList();

}
