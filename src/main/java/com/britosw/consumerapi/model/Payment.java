package com.britosw.consumerapi.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class Payment {
    private Double value;
    private String client;
    private String uc;
}
