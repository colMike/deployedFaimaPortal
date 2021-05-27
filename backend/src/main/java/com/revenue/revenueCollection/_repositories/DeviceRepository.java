package com.revenue.revenueCollection._repositories;

import com.revenue.revenueCollection._domains.Devices;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeviceRepository extends CrudRepository<Devices, Long> {

  @Query(
      "select d from devices d where d.deleted=false or d.deleted is null and d.deletedon is null ")
  List<Devices> findAll();

  @Query(
      "select d from devices d where d.deleted=false or d.deleted is null and d.deletedon is null and d.linked=true")
  List<Devices> findDeviceAndAgentDetails();

  Devices findByDeviceimei(String deviceimei);

  Devices findByDeviceid(Long deviceId);

  @Query("select d from devices d where d.agentid is null")
  List<Devices> findDevicesToIssue();

  @Query("select d from devices d where d.approved=false or d.approved is null")
  List<Devices> findDeviceToApprove();

  @Query("select d from devices d where d.deleted=true and d.deletedon is null")
  List<Devices> findDeviceToApproveDelete();
}
