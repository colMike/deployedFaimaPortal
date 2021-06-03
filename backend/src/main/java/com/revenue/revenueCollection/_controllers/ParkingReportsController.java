package com.revenue.revenueCollection._controllers;

import com.revenue.revenueCollection._repositories.ParkingPaymentRepository;
import com.revenue.revenueCollection._service.ParkingPaymentService;
import com.revenue.revenueCollection._service.reports.ParkingPaymentReportService;
import com.revenue.revenueCollection._shared.dto.IParkingPaymentRefinedDto;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/api/parkingService/")
public class ParkingReportsController {

  @Autowired ParkingPaymentService parkingPaymentService;
  @Autowired ParkingPaymentRepository parkingPaymentRepository;

  @GetMapping(
      path = "/getParkingPayments",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<IParkingPaymentRefinedDto> getParkingPayments() {

    List<IParkingPaymentRefinedDto> list = parkingPaymentRepository.findAllParkingPaymentDetails();
    list.forEach(l -> System.out.println(l));

    return list;

    //    List<ParkingPaymentRest> returnValue = new ArrayList<>();
    //    List<ParkingPaymentDto> parkingPayments = parkingPaymentService.getAllParkingPayments();
    //
    //    for (ParkingPaymentDto parkingPaymentDto : parkingPayments) {
    //
    //      ParkingPaymentRest parkingPaymentModel = new ParkingPaymentRest();
    //      BeanUtils.copyProperties(parkingPaymentDto, parkingPaymentModel);
    //      returnValue.add(parkingPaymentModel);
    //    }

    //    return returnValue;
  }

  @GetMapping(path = "/testReport")
  public ResponseEntity<byte[]> testReport() throws IOException, JRException {

    ParkingPaymentReportService parkingPaymentReportService = new ParkingPaymentReportService();

    return parkingPaymentReportService.exportReport("pdf");

  }
}
