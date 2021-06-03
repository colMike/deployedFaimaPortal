package com.revenue.revenueCollection._repositories;

import com.revenue.revenueCollection._domains.ParkingPayments;
import com.revenue.revenueCollection._shared.dto.IParkingPaymentRefinedDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ParkingPaymentRepository extends CrudRepository<ParkingPayments, Long> {

//  @Query("select new com.revenue.revenueCollection._shared.dto.IParkingPaymentRefinedDto(p.parkingPaymentId, p2.serviceName, s.subCountyName, p.regNumber, c.carTypeName, p.fee, p.paymentDate) from ParkingPayments p inner join p.parking p2 inner join p.cars c inner join p.subCounties s")
//  List<IParkingPaymentRefinedDto> findAllParkingPaymentDetails();
//
  @Query(
          nativeQuery = true,
          value =
                  "select p.parking_payment_id AS parkingPaymentId, p2.service_name AS serviceName, s.sub_county_name AS subCountyName, p.reg_number AS regNumber, c.car_type_name AS carTypeName, p.amount AS fee, p.payment_date AS paymentDate\n"
                          + "from parking_payments p\n"
                          + "         inner join parking p2 on p.parking_type_id = p2.service_id\n"
                          + "         inner join car_type c on p.car_id = c.car_type_id\n"
                          + "         inner join sub_county s on p.zone_id = s.sub_county_id;")
  List<IParkingPaymentRefinedDto> findAllParkingPaymentDetails();
}
