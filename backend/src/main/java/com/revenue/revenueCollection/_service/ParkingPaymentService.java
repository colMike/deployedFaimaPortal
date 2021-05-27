package com.revenue.revenueCollection._service;

import com.revenue.revenueCollection._shared.dto.ParkingPaymentDto;

import java.util.List;

public interface ParkingPaymentService {
  List<ParkingPaymentDto> getAllParkingPayments();
}
