package com.revenue.revenueCollection.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.sql.Time;
import java.sql.Timestamp;


@Entity
public class priceConfig {
    @Id
    @GeneratedValue
    public int id;
    public int serviceId;
    public int createdBy;
    public Timestamp createdOn;
    public int subCountyId;
    public int fee;
    public int carTypeId;
    public int count;
    public int respCode;
    public String approved;
    public int approvedBy;
    public Timestamp approvedOn;
    public String create_Json;
    public String update_json;
    public String deleted;
    public int deletedBy;
    public String remarks;
    public String active;
    public Timestamp deletedOn;

    public String sub_county_name;

    public String car_type_name;

    public String service_name;

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public String getSubcountyName() {
        return sub_county_name;
    }

    public void setSubCountyName(String sub_county_name) {
        this.sub_county_name = sub_county_name;
    }

    public String getCarTypeName() {
        return car_type_name;
    }

    public void setCarTypeName(String car_type_name) {
        this.car_type_name = car_type_name;
    }

    public String getServiceName() {
        return service_name;
    }

    public void setServiceName(String service_name) {
        this.service_name = service_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }

    public int getSubCountyId() {
        return subCountyId;
    }

    public void setSubCountyId(int subCountyId) {
        this.subCountyId = subCountyId;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getCarTypeId() {
        return carTypeId;
    }

    public void setCarTypeId(int carTypeId) {
        this.carTypeId = carTypeId;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public int getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(int approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Timestamp getApprovedOn() {
        return approvedOn;
    }

    public void setApprovedOn(Timestamp approvedOn) {
        this.approvedOn = approvedOn;
    }

    public String getCreate_Json() {
        return create_Json;
    }

    public void setCreate_Json(String create_Json) {
        this.create_Json = create_Json;
    }

    public String getUpdate_json() {
        return update_json;
    }

    public void setUpdate_json(String update_json) {
        this.update_json = update_json;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public int getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(int deletedBy) {
        this.deletedBy = deletedBy;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Timestamp getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(Timestamp deletedOn) {
        this.deletedOn = deletedOn;
    }

    @Override
    public String toString() {
        return "priceConfig{" +
                "serviceId=" + serviceId +
                ", createdBy=" + createdBy +
                ", createdOn=" + createdOn +
                ", subCountyId=" + subCountyId +
                ", fee=" + fee +
                ", carTypeId=" + carTypeId +
                ", count=" + count +
                ", respCode=" + respCode +
                ", approved='" + approved + '\'' +
                ", approvedBy=" + approvedBy +
                ", approvedOn=" + approvedOn +
                ", create_Json='" + create_Json + '\'' +
                ", update_json='" + update_json + '\'' +
                ", deleted='" + deleted + '\'' +
                ", deletedBy=" + deletedBy +
                ", remarks='" + remarks + '\'' +
                ", active='" + active + '\'' +
                ", deletedOn=" + deletedOn +
                ", subCountyName='" + sub_county_name + '\'' +
                ", car_type_name='" + car_type_name + '\'' +
                ", service_name='" + service_name + '\'' +
                '}';
    }
}
