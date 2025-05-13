package com.airfranceklm.fasttrack.assignment.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.airfranceklm.fasttrack.assignment.jpa.HolidayEntity;
import com.airfranceklm.fasttrack.assignment.service.HolidayService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/holidays")
@AllArgsConstructor
public class HolidaysApi {

   private final HolidayService holidayService;

   //get all holidays
   @RequestMapping(method = RequestMethod.GET)
   public ResponseEntity<List<HolidayEntity>> getHolidays() {
      return new ResponseEntity<>(this.holidayService.getHolidays(), HttpStatus.OK);
   }

   //post holiday
   @RequestMapping(method = RequestMethod.POST)
   public ResponseEntity<HolidayEntity> createHoliday(@RequestBody HolidayEntity holiday) {
      return new ResponseEntity<>(this.holidayService.createHoliday(holiday), HttpStatus.CREATED);
   }

   //delete holiday
   @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
   public ResponseEntity<Void> deleteHolidayById(@PathVariable("id") String holidayId) {
      this.holidayService.deleteHolidayById(holidayId);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
   }
}
