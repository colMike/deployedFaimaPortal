package com.revenue.revenueCollection._shared.dto;

import org.springframework.context.annotation.Bean;

public class ParkingPaymentRefinedDto {

    public Long id;
    public String parkingType;
    public String parkingZone;
    public String regNumber;
    public String carType;
    public Integer amount;
    public String paymentDate;

    public ParkingPaymentRefinedDto(Long id, String parkingType, String parkingZone, String regNumber, String carType, Integer amount, String paymentDate) {
        this.id = id;
        this.parkingType = parkingType;
        this.parkingZone = parkingZone;
        this.regNumber = regNumber;
        this.carType = carType;
        this.amount = amount;
        this.paymentDate = paymentDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getParkingType() {
        return parkingType;
    }

    public void setParkingType(String parkingType) {
        this.parkingType = parkingType;
    }

    public String getParkingZone() {
        return parkingZone;
    }

    public void setParkingZone(String parkingZone) {
        this.parkingZone = parkingZone;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }
}
