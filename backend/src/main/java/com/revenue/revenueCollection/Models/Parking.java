package com.revenue.revenueCollection.Models;

import com.revenue.revenueCollection._domains.ParkingPayments;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Set;

@Entity
public class Parking implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "service_id")
    public int serviceId;
    public String serviceCode;
    public String serviceName;

    public boolean active;
    public int createdBy;
    public Timestamp createdOn;
    public String approved;
    public String approvedBy;
    public Timestamp approvedOn;
    public String deleted;
    public String deletedBy;
    public Timestamp deletedOn;
    public int respCode;
    public String creationStatus;
    public String createJson;
    public String updatedJson;
    public String updatedBy;

    public int count;


    @OneToMany(targetEntity = ParkingPayments.class, mappedBy = "parkingPaymentId", orphanRemoval = false, fetch = FetchType.LAZY)
    private Set<ParkingPayments> parkingPayments;

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
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

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public Timestamp getApprovedOn() {
        return approvedOn;
    }

    public void setApprovedOn(Timestamp approvedOn) {
        this.approvedOn = approvedOn;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public String getDeletedBy() {
        return deletedBy;
    }

    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    public Timestamp getDeletedOn() {
        return deletedOn;
    }

    public void setDeletedOn(Timestamp deletedOn) {
        this.deletedOn = deletedOn;
    }

    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public String getCreationStatus() {
        return creationStatus;
    }

    public void setCreationStatus(String creationStatus) {
        this.creationStatus = creationStatus;
    }

    public String getCreateJson() {
        return createJson;
    }

    public void setCreateJson(String createJson) {
        this.createJson = createJson;
    }

    public String getUpdatedJson() {
        return updatedJson;
    }

    public void setUpdatedJson(String updatedJson) {
        this.updatedJson = updatedJson;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "serviceId=" + serviceId +
                ", serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", active=" + active +
                ", createdBy=" + createdBy +
                ", createdOn=" + createdOn +
                ", approved='" + approved + '\'' +
                ", approvedBy='" + approvedBy + '\'' +
                ", approvedOn=" + approvedOn +
                ", deleted='" + deleted + '\'' +
                ", deletedBy='" + deletedBy + '\'' +
                ", deletedOn=" + deletedOn +
                ", respCode=" + respCode +
                ", creationStatus='" + creationStatus + '\'' +
                ", createJson='" + createJson + '\'' +
                ", updatedJson='" + updatedJson + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", count=" + count +
                '}';
    }
}
