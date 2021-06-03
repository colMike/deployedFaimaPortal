package com.revenue.revenueCollection.Utility;

import com.revenue.revenueCollection._service.reports.ParkingPaymentReportService;
import net.sf.jasperreports.engine.JRException;

import java.io.IOException;

public class GenerateReport {

  public static void main(String[] args) throws IOException, JRException {
    ParkingPaymentReportService parkingPaymentReportService = new ParkingPaymentReportService();

    parkingPaymentReportService.exportReport("pdf");
  }
}
