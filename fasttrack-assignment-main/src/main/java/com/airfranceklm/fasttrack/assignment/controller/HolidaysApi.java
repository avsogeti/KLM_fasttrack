package com.airfranceklm.fasttrack.assignment.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.airfranceklm.fasttrack.assignment.resources.Holiday;
import com.airfranceklm.fasttrack.assignment.resources.enums.Status;

@Controller
@RequestMapping("/holidays")
public class HolidaysApi {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<Holiday>> getHolidays() {
        return new ResponseEntity<List<Holiday>>(Arrays.asList(new Holiday(
              "1", "Holiday 1", "123", "2023-01-01", "2023-01-10", Status.DRAFT),
              new Holiday("2", "Holiday 2", "123", "2023-01-01", "2023-01-10", Status.DRAFT)


        ), HttpStatus.OK);
    }

}
