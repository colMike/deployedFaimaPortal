package com.revenue.revenueCollection._repositories;

import com.revenue.revenueCollection._domains.Devices;
import com.revenue.revenueCollection._domains.Devices;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DeviceRepository extends CrudRepository<Devices, Long> {

    Devices findByDeviceimei(String deviceimei);

    Devices findByDeviceid(Long deviceId);

    @Query("select d from devices d where d.approved=false")
    List<Devices> findDeviceToApprove();

    @Query("select d from devices d where d.deleted=true and d.deletedon is null")
    List<Devices> findDeviceToApproveDelete();



}
