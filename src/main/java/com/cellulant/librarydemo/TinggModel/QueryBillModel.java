package com.cellulant.librarydemo.TinggModel;

/**
 * @author joshua.kisee
 * @project LibraryDemo
 * @created 21/11/2022
 */

public class QueryBillModel {
    private String countryCode;
    private String function;
    private QueryBillPayloadModel payload;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public QueryBillPayloadModel getPayload() {
        return payload;
    }

    public void setPayload(QueryBillPayloadModel payload) {
        this.payload = payload;
    }
}
