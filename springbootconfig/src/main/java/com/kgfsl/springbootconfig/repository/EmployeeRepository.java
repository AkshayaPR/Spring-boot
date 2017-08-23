package com.kgfsl.springbootconfig.repository;

import com.kgfsl.springbootconfig.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}