package com.cellulant.librarydemo.TinggServices;

import com.cellulant.librarydemo.TinggModel.QueryBillCredentialsModel;
import com.cellulant.librarydemo.TinggModel.QueryBillModel;
import com.cellulant.librarydemo.TinggModel.QueryBillPacketModel;
import com.cellulant.librarydemo.TinggModel.QueryBillPayloadModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author joshua.kisee
 * @project LibraryDemo
 * @created 19/11/2022
 */

@Service
public class PaymentTingg {

    @Autowired
    TinggHttpRequest tinggHttpRequest;

    public Object queryBill(String countryCode,
                            String username,
                            String password,
                            String serviceId,
                            String accountNumber,
                            String serviceCode,
                            String MSISDN){

        //formulate request
        QueryBillCredentialsModel queryBillCredentialsModel =  new QueryBillCredentialsModel();
        queryBillCredentialsModel.setUsername(username);
        queryBillCredentialsModel.setPassword(password);

        QueryBillPacketModel queryBillPacketModel =  new QueryBillPacketModel();
        queryBillPacketModel.setServiceId(serviceId);
        queryBillPacketModel.setAccountNumber(accountNumber);
        queryBillPacketModel.setServiceCode(serviceCode);
        queryBillPacketModel.setMSISDN(MSISDN);
        queryBillPacketModel.setPayerTransactionID(MSISDN);

        QueryBillPayloadModel queryBillPayloadModel =  new QueryBillPayloadModel();
        queryBillPayloadModel.setCredentials(queryBillCredentialsModel);
        queryBillPayloadModel.setPacket(Collections.singletonList(queryBillPacketModel));

        QueryBillModel queryBillModel =  new QueryBillModel();
        queryBillModel.setCountryCode(countryCode);
        queryBillModel.setFunction("BEEP.queryBill");
        queryBillModel.setPayload(queryBillPayloadModel);

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        System.out.println("my payload >>>"+queryBillModel);

        String url = "https://beep2.cellulant.africa:9001/paymentRouter/JSONV2/";
        ResponseEntity res =  tinggHttpRequest.postRequest(url, queryBillModel, headers);

        return res.getBody();

    }

}
