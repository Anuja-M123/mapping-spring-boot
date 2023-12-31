package com.example.project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.Model.Employee;
import com.example.project.Repository.EmployeeRepo;

@Service
public class EmployeeService {
      @Autowired
      private EmployeeRepo employeeRepo;
    public void save(List<Employee> employee) {
        employeeRepo.saveAll(employee);
    }
    public List<Employee> getAll() {
        List<Employee> list = employeeRepo.findAll();
        return list;
    }
    public Optional<Employee> getByID(Long id) {
        Optional<Employee> list = employeeRepo.findById(id);
        return list;
    }
   
   
    
}
