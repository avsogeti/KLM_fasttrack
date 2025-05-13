package com.airfranceklm.fasttrack.assignment.jpa;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class EmployeeEntity
{
   @Id
   @Nonnull
   @GeneratedValue(strategy = GenerationType.UUID)
   @Column(name = "employee_id", nullable = false, updatable = false, unique = true)
   private String employeeId;


   @Nonnull
   @Column(name = "name")
   private String name;
}


