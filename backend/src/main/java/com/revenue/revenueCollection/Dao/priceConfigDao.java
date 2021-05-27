package com.revenue.revenueCollection.Dao;

import com.revenue.revenueCollection.Models.priceConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface priceConfigDao extends JpaRepository<priceConfig, Integer> {
  //  @Query("  select u from priceConfig u where u.approved='V' and (u.deleted='U'  or u.deleted IS
  // NULL)")
  @Query(
      nativeQuery = true,
      value =
          "select u.active\n"
              + "     , u.id\n"
              + "     , sc.sub_county_name\n"
              + "     , p.service_name\n"
              + "     , ct.car_type_name\n"
              + "     , u.approved\n"
              + "     , u.approved_by\n"
              + "     , u.approved_on\n"
              + "     , u.car_type_id\n"
              + "     , u.count\n"
              + "     , u.create_json\n"
              + "     , u.created_by\n"
              + "     , u.created_on\n"
              + "     , u.deleted\n"
              + "     , u.deleted_by\n"
              + "     , u.deleted_on\n"
              + "     , u.fee\n"
              + "     , u.remarks\n"
              + "     , u.resp_code\n"
              + "     , u.service_id\n"
              + "     , u.sub_county_id\n"
              + "     , u.update_json\n"
              + "from price_config u\n"
              + "         inner join parking p on p.service_id = u.service_id\n"
              + "         inner join sub_county sc on sc.sub_county_id = u.sub_county_id\n"
              + "         inner join car_type ct on ct.car_type_id = u.car_type_id\n"
              + "where u.approved = 'V' and (u.deleted = 'U' or u.deleted IS NULL)\n"
              + "ORDER BY sc.sub_county_name;")
  List<priceConfig> findAllPrices();

  @Query(nativeQuery = true,
          value =
      "select u.active\n"
          + "     , u.id\n"
          + "     , sc.sub_county_name\n"
          + "     , p.service_name\n"
          + "     , ct.car_type_name\n"
          + "     , u.approved\n"
          + "     , u.approved_by\n"
          + "     , u.approved_on\n"
          + "     , u.car_type_id\n"
          + "     , u.count\n"
          + "     , u.create_json\n"
          + "     , u.created_by\n"
          + "     , u.created_on\n"
          + "     , u.deleted\n"
          + "     , u.deleted_by\n"
          + "     , u.deleted_on\n"
          + "     , u.fee\n"
          + "     , u.remarks\n"
          + "     , u.resp_code\n"
          + "     , u.service_id\n"
          + "     , u.sub_county_id\n"
          + "     , u.update_json\n"
          + "from price_config u\n"
          + "         inner join parking p on p.service_id = u.service_id\n"
          + "         inner join sub_county sc on sc.sub_county_id = u.sub_county_id\n"
          + "         inner join car_type ct on ct.car_type_id = u.car_type_id\n"
          + "where u.approved='N'\n"
          + "ORDER BY sc.sub_county_name;")
  List<priceConfig> findPriceToApprove();

  @Query(
      nativeQuery = true,
      value =
          "select u.active\n"
              + "     , u.id\n"
              + "     , sc.sub_county_name\n"
              + "     , p.service_name\n"
              + "     , ct.car_type_name\n"
              + "     , u.approved\n"
              + "     , u.approved_by\n"
              + "     , u.approved_on\n"
              + "     , u.car_type_id\n"
              + "     , u.count\n"
              + "     , u.create_json\n"
              + "     , u.created_by\n"
              + "     , u.created_on\n"
              + "     , u.deleted\n"
              + "     , u.deleted_by\n"
              + "     , u.deleted_on\n"
              + "     , u.fee\n"
              + "     , u.remarks\n"
              + "     , u.resp_code\n"
              + "     , u.service_id\n"
              + "     , u.sub_county_id\n"
              + "     , u.update_json\n"
              + "from price_config u\n"
              + "         inner join parking p on p.service_id = u.service_id\n"
              + "         inner join sub_county sc on sc.sub_county_id = u.sub_county_id\n"
              + "         inner join car_type ct on ct.car_type_id = u.car_type_id\n"
              + "where u.deleted = 'D'\n"
              + "ORDER BY sc.sub_county_name;")
  List<priceConfig> findPriceToApproveDelete();
}
