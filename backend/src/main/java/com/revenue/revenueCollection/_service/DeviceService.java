package com.revenue.revenueCollection._service;


import com.revenue.revenueCollection._shared.dto.DeviceDto;

import java.util.List;

public interface DeviceService {

    List<DeviceDto> getAllDevices();

    List<DeviceDto> getDeviceToApprove();

    DeviceDto approveDevice(DeviceDto agent);

    List<DeviceDto> getDevicesToApproveDelete();

    DeviceDto createDevice(DeviceDto agent);

    DeviceDto updateDevice(DeviceDto agentDto);

    DeviceDto deleteDevice(DeviceDto agentDto);

    DeviceDto approveDeleteDevice(DeviceDto agentDto);
}
