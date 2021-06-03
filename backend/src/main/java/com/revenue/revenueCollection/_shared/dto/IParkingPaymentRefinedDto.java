package com.revenue.revenueCollection._shared.dto;

import java.sql.Timestamp;
import java.util.Date;

public class IParkingPaymentRefinedDto {

  public long id;
  public String regNumber;
  public double fee;
  public Timestamp paymentDate;
  public String serviceName;
  public String subCountyName;
  public String carTypeName;

  public IParkingPaymentRefinedDto(
          long id,
          String serviceName,
          String subCountyName,
          String regNumber,
          String carTypeName,
          double fee,
          Timestamp paymentDate) {
    this.id = id;
    this.regNumber = regNumber;
    this.fee = fee;
    this.paymentDate = paymentDate;
    this.serviceName = serviceName;
    this.subCountyName = subCountyName;
    this.carTypeName = carTypeName;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getRegNumber() {
    return regNumber;
  }

  public void setRegNumber(String regNumber) {
    this.regNumber = regNumber;
  }

  public double getFee() {
    return fee;
  }

  public void setFee(double fee) {
    this.fee = fee;
  }

  public Timestamp getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(Timestamp paymentDate) {
    this.paymentDate = paymentDate;
  }

  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public String getSubCountyName() {
    return subCountyName;
  }

  public void setSubCountyName(String subCountyName) {
    this.subCountyName = subCountyName;
  }

  public String getCarTypeName() {
    return carTypeName;
  }

  public void setCarTypeName(String carTypeName) {
    this.carTypeName = carTypeName;
  }

  @Override
  public String toString() {
    return "IParkingPaymentRefinedDto{"
            + "id="
            + id
            + ", regNumber='"
            + regNumber
            + '\''
            + ", fee="
            + fee
            + ", paymentDate='"
            + paymentDate
            + '\''
            + ", serviceName='"
            + serviceName
            + '\''
            + ", subCountyName='"
            + subCountyName
            + '\''
            + ", carTypeName='"
            + carTypeName
            + '\''
            + '}';
  }
}
