package com.example.springbatch.itemprocessorexample.Job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.annotation.BeforeProcess;
import org.springframework.batch.item.ItemProcessor;
import com.example.springbatch.itemprocessorexample.Model.FutureTransaction;
import com.example.springbatch.itemprocessorexample.Model.TransactionSummary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FutureTransactionProcessor implements ItemProcessor<FutureTransaction, List<TransactionSummary>> {

    private static final Logger LOGGER = LoggerFactory.getLogger(FutureTransactionProcessor.class);
    Map<String, Map<String, Long>> clientList = new HashMap<>();
    List<TransactionSummary> summaries = new ArrayList<>();

    List<String> clientProducts = new ArrayList<>();
    List<Long> transactionAmounts = new ArrayList<>();

    @BeforeProcess
    public void beforeProcess() {
        clientList = new HashMap<>();
        summaries = new ArrayList<>();
    }

    @Override
    public List<TransactionSummary> process(FutureTransaction item) throws Exception {
        System.out.println(item);

        transferFutureTransactionWrapperToMap(item);
return null;

    }



    private void transferFutureTransactionWrapperToMap(FutureTransaction item) {
        String clientInformation = item.transformToClientInformation();
        String productInformation = item.transformToProductInformation();
        Long transactionAmount = item.transformToTransactionAmount();

        int index = clientProducts.indexOf(clientInformation + productInformation);
        if(index != -1){
            transactionAmounts.set(index, transactionAmounts.get(index) + transactionAmount);
        }
        else{
            clientProducts.add(clientInformation + productInformation);
            transactionAmounts.add(transactionAmount);
        }

        LOGGER.debug("ClientInformation: " + clientInformation);
        if (!clientList.containsKey(clientInformation)) {
            clientList.put(clientInformation, new HashMap<>());
        }
        LOGGER.debug(clientList.get(clientInformation).toString());

        LOGGER.debug("productInformation: " + productInformation);
        Map<String, Long> client = clientList.get(clientInformation);
        if (!client.containsKey(productInformation)) {
            client.put(productInformation, 0L);
        }
        LOGGER.debug("transactionAmount: " + client.get(productInformation));
        client.put(productInformation, client.get(productInformation) + transactionAmount);
    }
}
