package com.example.springbatch.itemprocessorexample.FileTransformer;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;
import com.example.springbatch.itemprocessorexample.Model.FutureTransaction;

@Component
public class FutureTransactionFieldSetMapper implements FieldSetMapper<FutureTransaction> {

    public FutureTransaction mapFieldSet(FieldSet fieldSet) {
        return FutureTransaction.builder()
                                .recordCode(fieldSet.readInt("recordCode"))
                                .clientType(fieldSet.readRawString("clientType"))
                                .clientNumber(fieldSet.readInt("clientNumber"))
                                .accountNumber(fieldSet.readInt("accountNumber"))
                                .subAccountNumber(fieldSet.readInt("subAccountNumber"))
                                .oppositePartyCode(fieldSet.readRawString("oppositePartyCode"))
                                .productGroupCode(fieldSet.readRawString("productGroupCode"))
                                .exchangeCode(fieldSet.readRawString("exchangeCode"))
                                .symbol(fieldSet.readRawString("symbol"))
                                .expirationDate(fieldSet.readRawString("expirationDate"))
                                .currencyCode(fieldSet.readRawString("currencyCode"))
                                .movementCode(fieldSet.readRawString("movementCode"))
                                .buySellCode(fieldSet.readRawString("buySellCode"))
                                .quantityLongSign(fieldSet.readInt("quantityLongSign"))
                                .quantityLong(fieldSet.readLong("quantityLong"))
                                .quantityShortSign(fieldSet.readInt("quantityShortSign"))
                                .quantityShort(fieldSet.readLong("quantityShort"))
                                .exchBrokerFeeDec(fieldSet.readDouble("exchBrokerFeeDec"))
                                .exchBrokerFeeDC(fieldSet.readInt("exchBrokerFeeDC"))
                                .exchBrokerFeeCurCode(fieldSet.readRawString("exchBrokerFeeCurCode"))
                                .clearingFeeDec(fieldSet.readDouble("clearingFeeDec"))
                                .clearingFeeDC(fieldSet.readInt("clearingFeeDC"))
                                .clearingFeeCurCode(fieldSet.readRawString("clearingFeeCurCode"))
                                .commission(fieldSet.readDouble("commission"))
                                .commissionDC(fieldSet.readInt("commissionDC"))
                                .commissionCurCode(fieldSet.readRawString("commissionCurCode"))
                                .transactionDate(fieldSet.readRawString("transactionDate"))
                                .futureReference(fieldSet.readInt("futureReference"))
                                .ticketNumber(fieldSet.readRawString("ticketNumber"))
                                .externalNumber(fieldSet.readInt("externalNumber"))
                                .transactionPrice(fieldSet.readDouble("transactionPrice"))
                                .traderInitials(fieldSet.readRawString("traderInitials"))
                                .oppositeTraderId(fieldSet.readRawString("oppositeTraderId"))
                                .openCloseCode(fieldSet.readRawString("openCloseCode"))
                                .filler(fieldSet.readRawString("filler"))
                                .build();
    }
}
