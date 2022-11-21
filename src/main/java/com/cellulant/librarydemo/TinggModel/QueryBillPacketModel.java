package com.cellulant.librarydemo.TinggModel;

/**
 * @author joshua.kisee
 * @project LibraryDemo
 * @created 21/11/2022
 */

public class QueryBillPacketModel {
    private String serviceId;
    private String accountNumber;
    private String serviceCode;
    private String MSISDN;
    private String payerTransactionID;

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getMSISDN() {
        return MSISDN;
    }

    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getPayerTransactionID() {
        return payerTransactionID;
    }

    public void setPayerTransactionID(String payerTransactionID) {
        this.payerTransactionID = payerTransactionID;
    }
}
