package com.jasperdemo.json.JasperJson;

import java.util.List;
import java.util.Map;

public class ReportRequest {
    private String serviceProviderName;
    private String teamLeadName;

    private String appointmentDate;
    private String contactNumber;
    private String insuredNameandSurname;
    private String riskAddress;
    private String subLossClass;
    private String policyNumber;
    private String claimReportedDate;
    private String insuredContactDetails;
    private String sumlnsured;
    private String claimNumber;
    private String lossClass;
    private String dateofLoss;
    private String skill;
    private String typeofProperty;

    private List<Map<String, Object>> onSitelmages;
    private List<Map<String, Object>> photosofDamages;

    private List<Miscellaneous> miscellaneous;
    private List<ItemDetail> itemDetails;

    // Getters and Setters
    public String getServiceProviderName() {
        return serviceProviderName;
    }

    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    public String getTeamLeadName() {
        return teamLeadName;
    }

    public void setTeamLeadName(String teamLeadName) {
        this.teamLeadName = teamLeadName;
    }

    public List<Map<String, Object>> getOnSitelmages() {
        return onSitelmages;
    }

    public void setOnSitelmages(List<Map<String, Object>> onSitelmages) {
        this.onSitelmages = onSitelmages;
    }

    public List<Map<String, Object>> getPhotosofDamages() {
        return photosofDamages;
    }

    public void setPhotosofDamages(List<Map<String, Object>> photosofDamages) {
        this.photosofDamages = photosofDamages;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getInsuredName() {
        return insuredNameandSurname;
    }

    public void setInsuredName(String insuredName) {
        this.insuredNameandSurname = insuredName;
    }

    public String getRiskAddress() {
        return riskAddress;
    }

    public void setRiskAddress(String riskAddress) {
        this.riskAddress = riskAddress;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getClaimReportedDate() {
        return claimReportedDate;
    }

    public void setClaimReportedDate(String claimReportedDate) {
        this.claimReportedDate = claimReportedDate;
    }

    public String getInsuredContactDetails() {
        return insuredContactDetails;
    }

    public void setInsuredContactDetails(String insuredContactDetails) {
        this.insuredContactDetails = insuredContactDetails;
    }

    public String getSumlnsured() {
        return sumlnsured;
    }

    public void setSumlnsured(String sumlnsured) {
        this.sumlnsured = sumlnsured;
    }

    public String getClaimNumber() {
        return claimNumber;
    }

    public void setClaimNumber(String claimNumber) {
        this.claimNumber = claimNumber;
    }

    public String getLossClass() {
        return lossClass;
    }

    public void setLossClass(String lossClass) {
        this.lossClass = lossClass;
    }

    public String getDateofLoss() {
        return dateofLoss;
    }

    public void setDateofLoss(String dateofLoss) {
        this.dateofLoss = dateofLoss;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getTypeofProperty() {
        return typeofProperty;
    }

    public void setTypeofProperty(String typeofProperty) {
        this.typeofProperty = typeofProperty;
    }

    public String getInsuredNameandSurname() {
        return insuredNameandSurname;
    }

    public void setInsuredNameandSurname(String insuredNameandSurname) {
        this.insuredNameandSurname = insuredNameandSurname;
    }

    public String getSubLossClass() {
        return subLossClass;
    }

    public void setSubLossClass(String subLossClass) {
        this.subLossClass = subLossClass;
    }

    public List<Miscellaneous> getMiscellaneous() {
        return miscellaneous;
    }

    public void setMiscellaneous(List<Miscellaneous> miscellaneous) {
        this.miscellaneous = miscellaneous;
    }

    public List<ItemDetail> getItemDetails() {
        return itemDetails;
    }

    public void setItemDetails(List<ItemDetail> itemDetails) {
        this.itemDetails = itemDetails;
    }
}
