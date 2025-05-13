package com.airfranceklm.fasttrack.assignment.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.airfranceklm.fasttrack.assignment.jpa.EmployeeEntity;
import com.airfranceklm.fasttrack.assignment.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeApi{

   private final EmployeeService employeeService;

   @RequestMapping(method = RequestMethod.GET)
   public ResponseEntity<List<EmployeeEntity>> getEmployees(){
      return new ResponseEntity<>(this.employeeService.getEmployee(), HttpStatus.OK );
   }

   @RequestMapping(method = RequestMethod.POST)
   public ResponseEntity<EmployeeEntity> createEmployee(@RequestBody EmployeeEntity employee) {
      return new ResponseEntity<>(this.employeeService.createEmployee(employee), HttpStatus.CREATED);
   }
}
