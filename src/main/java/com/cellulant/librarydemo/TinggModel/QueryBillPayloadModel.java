package com.cellulant.librarydemo.TinggModel;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author joshua.kisee
 * @project LibraryDemo
 * @created 21/11/2022
 */

@Setter
@Getter
public class QueryBillPayloadModel {
    private QueryBillCredentialsModel credentials;
    private List<QueryBillPacketModel> packet;
}
