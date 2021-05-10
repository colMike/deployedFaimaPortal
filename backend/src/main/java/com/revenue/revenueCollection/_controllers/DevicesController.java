package com.revenue.revenueCollection._controllers;

import com.revenue.revenueCollection._model.request.DeviceDetailsRequestModel;
import com.revenue.revenueCollection._model.response.AgentRest;
import com.revenue.revenueCollection._model.response.DeviceRest;
import com.revenue.revenueCollection._repositories.DeviceRepository;
import com.revenue.revenueCollection._service.AgentService;
import com.revenue.revenueCollection._service.DeviceService;
import com.revenue.revenueCollection._shared.dto.AgentDto;
import com.revenue.revenueCollection._shared.dto.DeviceDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/Device_linkingService/")
public class DevicesController {

  @Autowired DeviceService deviceService;

  @Autowired AgentService agentService;

  @Autowired DeviceRepository deviceRepository;

  @GetMapping(
      path = "/viewDevice",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<DeviceRest> getDevices() {

    List<DeviceRest> returnValue = new ArrayList<>();
    List<DeviceDto> devices = deviceService.getAllDevices();

    for (DeviceDto deviceDto : devices) {

      DeviceRest deviceModel = new DeviceRest();
      BeanUtils.copyProperties(deviceDto, deviceModel);
      returnValue.add(deviceModel);
    }

    return returnValue;
  }

  @PostMapping(
      path = "addDevice",
      produces = {MediaType.APPLICATION_JSON_VALUE},
      consumes = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<DeviceRest> createDevice(
      @Valid @RequestBody DeviceDetailsRequestModel deviceDetails) {

    DeviceRest returnValue = new DeviceRest();

    DeviceDto deviceDto = new DeviceDto();
    BeanUtils.copyProperties(deviceDetails, deviceDto);

    DeviceDto createdDevice = deviceService.createDevice(deviceDto);
    BeanUtils.copyProperties(createdDevice, returnValue);

    return ResponseEntity.status(200).body(returnValue);
  }

  @GetMapping("/getDevicesToIssue")
  public List<DeviceRest> getDeviceToIssue() {

    List<DeviceRest> returnValue = new ArrayList<>();
    List<DeviceDto> devices = deviceService.getDevicesToIssue();

    for (DeviceDto deviceDto : devices) {

      DeviceRest deviceModel = new DeviceRest();
      BeanUtils.copyProperties(deviceDto, deviceModel);
      returnValue.add(deviceModel);
    }

    return returnValue;
  }

  @GetMapping("getAgentToIssueDevice")
  public List<AgentRest> getAgentToIssueDevice() {

    List<AgentRest> returnValue = new ArrayList<>();
    List<AgentDto> agents = agentService.getDevicesToIssue();

    for (AgentDto agentDto : agents) {

      AgentRest agentModel = new AgentRest();
      BeanUtils.copyProperties(agentDto, agentModel);
      returnValue.add(agentModel);
    }

    return returnValue;
  }

  @GetMapping(
      path = "/viewDevicesToApprove",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<DeviceRest> getDeviceToApprove() {

    List<DeviceRest> returnValue = new ArrayList<>();
    List<DeviceDto> devices = deviceService.getDeviceToApprove();

    for (DeviceDto deviceDto : devices) {

      DeviceRest deviceModel = new DeviceRest();
      BeanUtils.copyProperties(deviceDto, deviceModel);
      returnValue.add(deviceModel);
    }

    return returnValue;
  }

  @GetMapping(
      path = "/viewDevicesToApproveDelete",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<DeviceRest> getDevicesToApproveDelete() {

    List<DeviceRest> returnValue = new ArrayList<>();
    List<DeviceDto> devices = deviceService.getDevicesToApproveDelete();

    for (DeviceDto deviceDto : devices) {

      DeviceRest deviceModel = new DeviceRest();
      BeanUtils.copyProperties(deviceDto, deviceModel);
      returnValue.add(deviceModel);
    }

    return returnValue;
  }

  @PutMapping(
      path = "updateDevice",
      produces = {MediaType.APPLICATION_JSON_VALUE},
      consumes = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<DeviceRest> updateDevice(
      @Valid @RequestBody DeviceDetailsRequestModel deviceDetails) {

    DeviceRest returnValue = new DeviceRest();

    DeviceDto deviceDto = new DeviceDto();
    BeanUtils.copyProperties(deviceDetails, deviceDto);

    DeviceDto updatedDevice = deviceService.updateDevice(deviceDto);
    BeanUtils.copyProperties(updatedDevice, returnValue);

    return new ResponseEntity<>(returnValue, HttpStatus.OK);
  }

  @PutMapping(
      path = "approveDevice",
      produces = {MediaType.APPLICATION_JSON_VALUE},
      consumes = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<DeviceRest> approveDevice(
      @Valid @RequestBody DeviceDetailsRequestModel deviceDetails) {

    DeviceRest returnValue = new DeviceRest();

    DeviceDto deviceDto = new DeviceDto();
    BeanUtils.copyProperties(deviceDetails, deviceDto);

    DeviceDto approvedDevice = deviceService.approveDevice(deviceDto);
    BeanUtils.copyProperties(approvedDevice, returnValue);

    return new ResponseEntity<>(returnValue, HttpStatus.OK);
  }

  @PutMapping(
      path = "deleteDevice",
      produces = {MediaType.APPLICATION_JSON_VALUE},
      consumes = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<DeviceRest> deleteDevice(
      @Valid @RequestBody DeviceDetailsRequestModel deviceDetails) {

    DeviceRest returnValue = new DeviceRest();

    DeviceDto deviceDto = new DeviceDto();
    BeanUtils.copyProperties(deviceDetails, deviceDto);

    DeviceDto updatedDevice = deviceService.deleteDevice(deviceDto);
    BeanUtils.copyProperties(updatedDevice, returnValue);

    return new ResponseEntity<>(returnValue, HttpStatus.OK);
  }

  @PutMapping(
      path = "approveDeleteDevice",
      produces = {MediaType.APPLICATION_JSON_VALUE},
      consumes = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<DeviceRest> approveDeleteDevice(
      @Valid @RequestBody DeviceDetailsRequestModel deviceDetails) {

    DeviceRest returnValue = new DeviceRest();

    DeviceDto deviceDto = new DeviceDto();
    BeanUtils.copyProperties(deviceDetails, deviceDto);

    DeviceDto updatedDevice = deviceService.approveDeleteDevice(deviceDto);
    BeanUtils.copyProperties(updatedDevice, returnValue);

    return new ResponseEntity<>(returnValue, HttpStatus.OK);
  }

  @GetMapping(
      path = "viewDevice_linking",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public List<DeviceRest> viewDeviceLinking() {

    List<DeviceRest> returnValue = new ArrayList<>();

    List<DeviceDto> devices = deviceService.viewDeviceLinking();

    for (DeviceDto deviceDto : devices) {

      DeviceRest deviceModel = new DeviceRest();
      BeanUtils.copyProperties(deviceDto, deviceModel);
      returnValue.add(deviceModel);
    }

    return returnValue;
  }

  @PutMapping(
      path = "addDevice_linking",
      produces = {MediaType.APPLICATION_JSON_VALUE},
      consumes = {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<DeviceRest> addDeviceLinking(
      @Valid @RequestBody DeviceDetailsRequestModel deviceDetails) {

    DeviceRest returnValue = new DeviceRest();

    DeviceDto deviceDto = new DeviceDto();
    BeanUtils.copyProperties(deviceDetails, deviceDto);

    DeviceDto updatedDevice = deviceService.addDeviceLinking(deviceDto);
    BeanUtils.copyProperties(updatedDevice, returnValue);

    return new ResponseEntity<>(returnValue, HttpStatus.OK);
  }
}
