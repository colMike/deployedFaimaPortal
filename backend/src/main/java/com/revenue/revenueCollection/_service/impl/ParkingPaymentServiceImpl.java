package com.revenue.revenueCollection._service.impl;

import com.revenue.revenueCollection._repositories.ParkingPaymentRepository;
import com.revenue.revenueCollection._service.ParkingPaymentService;
import com.revenue.revenueCollection._shared.dto.IParkingPaymentRefinedDto;
import com.revenue.revenueCollection._shared.dto.ParkingPaymentDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingPaymentServiceImpl implements ParkingPaymentService {

  @Autowired ParkingPaymentRepository parkingPaymentRepository;

  @Override
  public List<ParkingPaymentDto> getAllParkingPayments() {
    List<ParkingPaymentDto> returnValue = new ArrayList<>();

    List<IParkingPaymentRefinedDto> retrievedPayments = parkingPaymentRepository.findAllParkingPaymentDetails();


    for (IParkingPaymentRefinedDto parkingPayment : retrievedPayments) {
//      System.out.println(parkingPayment.serviceName());
      ParkingPaymentDto parkingPaymentDto = new ParkingPaymentDto();
      BeanUtils.copyProperties(parkingPayment, parkingPaymentDto);
      returnValue.add(parkingPaymentDto);
    }

    return returnValue;
  }
}
