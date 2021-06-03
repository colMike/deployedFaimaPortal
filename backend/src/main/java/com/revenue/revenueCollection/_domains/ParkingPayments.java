/**
 * 
 */
package com.revenue.revenueCollection._domains;

import com.revenue.revenueCollection.Models.CarType;
import com.revenue.revenueCollection.Models.Parking;
import com.revenue.revenueCollection.Models.SubCounty;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
public class ParkingPayments implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long parkingPaymentId;

	public Integer customerId;

	public Integer zoneId;
	public String subCountyCode;
	public Integer subCountyName;

	public Integer parkingId;
	public String serviceCode;
	public String serviceName;

	public Integer carId;
	public String carTypeName;
	public String regNumber;


	public Double fee;

	public String reference;
	public String paymentType;

	public String paymentReference;
	public String paymentResponse;
	public Integer paymentResponseCode;
	public String esbReference;
	public Timestamp paymentDate;
	public Timestamp transactionDate;
	public Boolean isPaid;
	public String createJson;
	public String updateJson;
	public String channel;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "serviceId", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Parking parking;


	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "carTypeId", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private CarType cars;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "subCountyId", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private SubCounty subCounties;


	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Long getParkingPaymentId() {
		return parkingPaymentId;
	}

	public void setParkingPaymentId(Long parkingPaymentId) {
		this.parkingPaymentId = parkingPaymentId;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getSubCountyId() {
		return zoneId;
	}

	public void setSubCountyId(Integer zoneId) {
		this.zoneId = zoneId;
	}

	public String getSubCountyCode() {
		return subCountyCode;
	}

	public void setSubCountyCode(String subCountyCode) {
		this.subCountyCode = subCountyCode;
	}

	public Integer getSubCountyName() {
		return subCountyName;
	}

	public void setSubCountyName(Integer subCountyName) {
		this.subCountyName = subCountyName;
	}

	public Integer getCarTypeId() {
		return carId;
	}

	public void setCarTypeId(Integer carId) {
		this.carId = carId;
	}

	public String getCarTypeName() {
		return carTypeName;
	}

	public void setCarTypeName(String carTypeName) {
		this.carTypeName = carTypeName;
	}

	public Integer getServiceId() {
		return parkingId;
	}

	public void setServiceId(Integer parkingId) {
		this.parkingId = parkingId;
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

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}

	public String getPaymentResponse() {
		return paymentResponse;
	}

	public void setPaymentResponse(String paymentResponse) {
		this.paymentResponse = paymentResponse;
	}

	public Integer getPaymentResponseCode() {
		return paymentResponseCode;
	}

	public void setPaymentResponseCode(Integer paymentResponseCode) {
		this.paymentResponseCode = paymentResponseCode;
	}

	public String getEsbReference() {
		return esbReference;
	}

	public void setEsbReference(String esbReference) {
		this.esbReference = esbReference;
	}

	public Timestamp getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Timestamp paymentDate) {
		this.paymentDate = paymentDate;
	}

	public Timestamp getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Boolean getPaid() {
		return isPaid;
	}

	public void setPaid(Boolean paid) {
		isPaid = paid;
	}

	public String getCreateJson() {
		return createJson;
	}

	public void setCreateJson(String createJson) {
		this.createJson = createJson;
	}

	public String getUpdateJson() {
		return updateJson;
	}

	public void setUpdateJson(String updateJson) {
		this.updateJson = updateJson;
	}
}
