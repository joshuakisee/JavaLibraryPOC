package com.cellulant.librarydemo.TinggModel;

import lombok.Getter;
import lombok.Setter;

/**
 * @author joshua.kisee
 * @project LibraryDemo
 * @created 21/11/2022
 */

@Setter
@Getter
public class QueryBillPacketModel {
    private String serviceId;
    private String accountNumber;
    private String serviceCode;
    private String MSISDN;
    private String payerTransactionID;
}
