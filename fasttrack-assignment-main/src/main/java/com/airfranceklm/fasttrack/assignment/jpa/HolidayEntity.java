package com.airfranceklm.fasttrack.assignment.jpa;

import com.airfranceklm.fasttrack.assignment.resources.enums.Status;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "holiday")
public class HolidayEntity
{
   @Id
   @GeneratedValue(strategy = GenerationType.UUID)
   @Column(name = "holiday_id", nullable = false, unique = true, updatable = false)
   private String holidayId;

   @Column(name = "holidayLabel", nullable = false)
   private String holidayLabel;

   @JoinColumn(name = "employee_id", nullable = false)
   private String employeeId;

   @Column(name = "startOfHoliday")
   private String startOfHoliday;

   @Column(name = "endOfHoliday")
   private String endOfHoliday;

   @Column(name = "status", nullable = false)
   private Status status;
}
