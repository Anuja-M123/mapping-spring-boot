package com.example.project.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    
}
