package com.example.springbatch.itemprocessorexample.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class TransactionSummary {

    private String clientInformation;
    private String productInformation;
//    Pair<String, String> clientProduct;

    private Long totalTransactionAmount;
}
