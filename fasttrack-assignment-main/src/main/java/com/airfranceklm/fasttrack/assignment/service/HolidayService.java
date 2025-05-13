package com.airfranceklm.fasttrack.assignment.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.airfranceklm.fasttrack.assignment.jpa.HolidayEntity;
import com.airfranceklm.fasttrack.assignment.repository.HolidayRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
   public class HolidayService{
      private final HolidayRepository holidayRepository;

      public List<HolidayEntity> getHolidays() {
         return holidayRepository.findAll();
      }

      public HolidayEntity createHoliday(HolidayEntity holiday) {
         return holidayRepository.save(holiday);
      }

      public void deleteHolidayById(String holidayId) {
         holidayRepository.deleteById(holidayId);
      }
}