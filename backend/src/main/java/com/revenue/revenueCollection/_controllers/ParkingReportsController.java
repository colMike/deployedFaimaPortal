package com.revenue.revenueCollection._controllers;

import com.revenue.revenueCollection._model.request.ParkingPaymentRequestModel;
import com.revenue.revenueCollection._model.response.ParkingPaymentRest;
import com.revenue.revenueCollection._service.ParkingPaymentService;
import com.revenue.revenueCollection._shared.dto.ParkingPaymentDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/parkingService/")
public class ParkingReportsController {

  @Autowired ParkingPaymentService parkingPaymentService;

  @GetMapping(
      path = "/getParkingPayments",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<ParkingPaymentRest> getParkingPayments() {

    List<ParkingPaymentRest> returnValue = new ArrayList<>();
    List<ParkingPaymentDto> parkingPayments = parkingPaymentService.getAllParkingPayments();

    for (ParkingPaymentDto parkingPaymentDto : parkingPayments) {

      ParkingPaymentRest parkingPaymentModel = new ParkingPaymentRest();
      BeanUtils.copyProperties(parkingPaymentDto, parkingPaymentModel);
      returnValue.add(parkingPaymentModel);
    }

    return returnValue;
  }

}
