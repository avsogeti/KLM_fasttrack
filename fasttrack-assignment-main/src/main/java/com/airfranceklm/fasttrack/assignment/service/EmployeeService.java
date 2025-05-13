package com.airfranceklm.fasttrack.assignment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.airfranceklm.fasttrack.assignment.jpa.EmployeeEntity;
import com.airfranceklm.fasttrack.assignment.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmployeeService {

   private final EmployeeRepository employeeRepository;

   public List<EmployeeEntity> getEmployee(){
      return employeeRepository.findAll();
   }

   public EmployeeEntity createEmployee(EmployeeEntity employee) {
      return employeeRepository.save(employee);
   }
}
