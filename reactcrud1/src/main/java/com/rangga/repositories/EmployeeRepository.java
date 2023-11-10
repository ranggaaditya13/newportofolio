package com.rangga.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rangga.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
