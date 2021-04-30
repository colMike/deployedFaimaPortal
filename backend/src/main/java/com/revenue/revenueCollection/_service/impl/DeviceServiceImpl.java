package com.revenue.revenueCollection._service.impl;

import com.revenue.revenueCollection._domains.Devices;
import com.revenue.revenueCollection._exceptions.DeviceServiceException;
import com.revenue.revenueCollection._repositories.DeviceRepository;
import com.revenue.revenueCollection._service.DeviceService;
import com.revenue.revenueCollection._shared.dto.DeviceDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

  @Autowired DeviceRepository deviceRepository;

  @Override
  public List<DeviceDto> getAllDevices() {

    List<DeviceDto> returnValue = new ArrayList<>();

    List<Devices> devices = (List<Devices>) deviceRepository.findAll();

    for (Devices device : devices) {
      DeviceDto deviceDto = new DeviceDto();
      BeanUtils.copyProperties(device, deviceDto);
      returnValue.add(deviceDto);
    }

    return returnValue;
  }

  @Override
  public List<DeviceDto> getDeviceToApprove() {
    List<DeviceDto> returnValue = new ArrayList<>();

    List<Devices> devices = deviceRepository.findDeviceToApprove();

    for (Devices device : devices) {
      DeviceDto deviceDto = new DeviceDto();
      BeanUtils.copyProperties(device, deviceDto);
      returnValue.add(deviceDto);
    }

    return returnValue;
  }

  @Override
  public DeviceDto approveDevice(DeviceDto device) {

    Devices deviceEntity = deviceRepository.findByDeviceid(device.getDeviceid());

    deviceEntity.setApproved(device.getApproved());
    deviceEntity.setApprovedby(device.getApprovedby());
    deviceEntity.setApprovedon(new Timestamp(System.currentTimeMillis()));

    Devices storedDeviceDetails = deviceRepository.save(deviceEntity);

    DeviceDto returnValue = new DeviceDto();
    BeanUtils.copyProperties(storedDeviceDetails, returnValue);

    return returnValue;
  }

  @Override
  public List<DeviceDto> getDevicesToApproveDelete() {
    List<DeviceDto> returnValue = new ArrayList<>();

    List<Devices> devices = deviceRepository.findDeviceToApproveDelete();

    for (Devices device : devices) {
      DeviceDto deviceDto = new DeviceDto();
      BeanUtils.copyProperties(device, deviceDto);
      returnValue.add(deviceDto);
    }

    return returnValue;
  }

  @Override
  public DeviceDto createDevice(DeviceDto device) {

    if (deviceRepository.findByDeviceimei(device.getDeviceimei()) != null) {
      throw new DeviceServiceException("Record already exists");
    }

    Devices deviceEntity = new Devices();

    BeanUtils.copyProperties(device, deviceEntity);

    deviceEntity.setCreatedon(new Timestamp(System.currentTimeMillis()));

    Devices storedDeviceDetails = deviceRepository.save(deviceEntity);

    DeviceDto returnValue = new DeviceDto();
    BeanUtils.copyProperties(storedDeviceDetails, returnValue);

    return returnValue;
  }

  @Override
  public DeviceDto updateDevice(DeviceDto device) {

    if (deviceRepository.findByDeviceimei(device.getDeviceimei()) == null) {

      System.out.println("here we are1");
      System.out.println(device);
      throw new DeviceServiceException("No Such record exists.");
    }

    System.out.println("here we are..");
    Devices deviceEntity = new Devices();

    BeanUtils.copyProperties(device, deviceEntity);

    deviceEntity.setApproved(false);

    Devices storedDeviceDetails = deviceRepository.save(deviceEntity);

    DeviceDto returnValue = new DeviceDto();
    BeanUtils.copyProperties(storedDeviceDetails, returnValue);

    return returnValue;
  }

  @Override
  public DeviceDto deleteDevice(DeviceDto device) {

    Devices deviceEntity = deviceRepository.findByDeviceimei(device.getDeviceimei());

    System.out.println(deviceEntity);
    System.out.println(device);

    deviceEntity.setDeleted(device.getDeleted());
    deviceEntity.setDeletedby(device.getDeletedby());
    deviceEntity.setRemarks(device.getRemarks());
//    deviceEntity.setdeletedon(new Date(System.currentTimeMillis()));

    Devices storedDeviceDetails = deviceRepository.save(deviceEntity);

    DeviceDto returnValue = new DeviceDto();
    BeanUtils.copyProperties(storedDeviceDetails, returnValue);

    return returnValue;
  }

  @Override
  public DeviceDto approveDeleteDevice(DeviceDto device) {

    Devices deviceEntity = deviceRepository.findByDeviceimei(device.getDeviceimei());

    System.out.println(deviceEntity);
    System.out.println(device);

    deviceEntity.setDeletedby(device.getDeletedby());
    deviceEntity.setDeletedon(new Timestamp(System.currentTimeMillis()));

    Devices storedDeviceDetails = deviceRepository.save(deviceEntity);

    DeviceDto returnValue = new DeviceDto();
    BeanUtils.copyProperties(storedDeviceDetails, returnValue);


    return returnValue;
  }
}