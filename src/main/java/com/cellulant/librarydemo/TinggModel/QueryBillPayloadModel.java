package com.cellulant.librarydemo.TinggModel;

import java.util.List;

/**
 * @author joshua.kisee
 * @project LibraryDemo
 * @created 21/11/2022
 */

public class QueryBillPayloadModel {
    private QueryBillCredentialsModel credentials;
    private List<QueryBillPacketModel> packet;

    public QueryBillCredentialsModel getCredentials() {
        return credentials;
    }

    public void setCredentials(QueryBillCredentialsModel credentials) {
        this.credentials = credentials;
    }

    public List<QueryBillPacketModel> getPacket() {
        return packet;
    }

    public void setPacket(List<QueryBillPacketModel> packet) {
        this.packet = packet;
    }
}
