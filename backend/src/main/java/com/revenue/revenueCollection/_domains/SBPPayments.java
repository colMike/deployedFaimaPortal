/** */
package com.revenue.revenueCollection._domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity(name = "SBPPAYMENT")
public class SBPPayments implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long sbpPaymentId;

  //	customer details
  public Integer customerId;
  public String applicantName;
  public Integer idCard;

  //	business details
  public String businessName;
  public String certificateOfIncorporation;
  public String pinNumber;
  public String vatNumber;
  public Integer poBox;
  public Integer postalCode;
  public String postalAddress;
  public String postalTown;
  public String permitType;
  public String registrationNo;
  public Double applicationFee;
  public Double advertisementFee;
  public String areaDescription;
  public Integer noOfEmployees;
  public Double billboardFee;
  public Double tradeNameFee;
  public String subCounty;
  public String ward;

  public String description;
  public String detailActivity;

  public Integer marketZone;
  public String paymentMethod;
  public String mobileNumber;
  public String alternativeMobileNumber;
  public String businessMobileNumber;
  public String alternativeBusinessMobileNumber;

  //	payment details
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

    public Long getSbpPaymentId() {
        return sbpPaymentId;
    }

    public void setSbpPaymentId(Long sbpPaymentId) {
        this.sbpPaymentId = sbpPaymentId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getCertificateOfIncorporation() {
        return certificateOfIncorporation;
    }

    public void setCertificateOfIncorporation(String certificateOfIncorporation) {
        this.certificateOfIncorporation = certificateOfIncorporation;
    }

    public String getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(String pinNumber) {
        this.pinNumber = pinNumber;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(String vatNumber) {
        this.vatNumber = vatNumber;
    }

    public Integer getPoBox() {
        return poBox;
    }

    public void setPoBox(Integer poBox) {
        this.poBox = poBox;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPostalTown() {
        return postalTown;
    }

    public void setPostalTown(String postalTown) {
        this.postalTown = postalTown;
    }

    public String getPermitType() {
        return permitType;
    }

    public void setPermitType(String permitType) {
        this.permitType = permitType;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public Double getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(Double applicationFee) {
        this.applicationFee = applicationFee;
    }

    public Double getAdvertisementFee() {
        return advertisementFee;
    }

    public void setAdvertisementFee(Double advertisementFee) {
        this.advertisementFee = advertisementFee;
    }

    public String getAreaDescription() {
        return areaDescription;
    }

    public void setAreaDescription(String areaDescription) {
        this.areaDescription = areaDescription;
    }

    public Integer getNoOfEmployees() {
        return noOfEmployees;
    }

    public void setNoOfEmployees(Integer noOfEmployees) {
        this.noOfEmployees = noOfEmployees;
    }

    public Double getBillboardFee() {
        return billboardFee;
    }

    public void setBillboardFee(Double billboardFee) {
        this.billboardFee = billboardFee;
    }

    public Double getTradeNameFee() {
        return tradeNameFee;
    }

    public void setTradeNameFee(Double tradeNameFee) {
        this.tradeNameFee = tradeNameFee;
    }

    public String getSubCounty() {
        return subCounty;
    }

    public void setSubCounty(String subCounty) {
        this.subCounty = subCounty;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDetailActivity() {
        return detailActivity;
    }

    public void setDetailActivity(String detailActivity) {
        this.detailActivity = detailActivity;
    }

    public Integer getMarketZone() {
        return marketZone;
    }

    public void setMarketZone(Integer marketZone) {
        this.marketZone = marketZone;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAlternativeMobileNumber() {
        return alternativeMobileNumber;
    }

    public void setAlternativeMobileNumber(String alternativeMobileNumber) {
        this.alternativeMobileNumber = alternativeMobileNumber;
    }

    public String getBusinessMobileNumber() {
        return businessMobileNumber;
    }

    public void setBusinessMobileNumber(String businessMobileNumber) {
        this.businessMobileNumber = businessMobileNumber;
    }

    public String getAlternativeBusinessMobileNumber() {
        return alternativeBusinessMobileNumber;
    }

    public void setAlternativeBusinessMobileNumber(String alternativeBusinessMobileNumber) {
        this.alternativeBusinessMobileNumber = alternativeBusinessMobileNumber;
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

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
