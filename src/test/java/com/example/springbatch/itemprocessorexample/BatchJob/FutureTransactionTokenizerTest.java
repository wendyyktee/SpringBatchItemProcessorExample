package com.example.springbatch.itemprocessorexample.BatchJob;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.batch.item.file.transform.FixedLengthTokenizer;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class FutureTransactionTokenizerTest {
    @Test
    void createLineTokenizerExpectAConfiguredFixedLengthTokenizerToBeReturned() {
        FutureTransactionTokenizer tokenizer = new FutureTransactionTokenizer();

        FixedLengthTokenizer tokenize = tokenizer.createTokenizer();
        String line = "315ABSD111133445566PARTY1G1EX01SYMB0120240118SGDFWB12222233333111111222228888899999228SGD7777766666227SGD3333322222113SGD20240115334455998877112233999988881234567WENDYT8711138O";

        FieldSet tokens = tokenize.tokenize(line);

        assertEquals(34, tokens.getFieldCount());
        assertEquals("ABSD", tokens.readRawString("clientType"));
        assertEquals(1111, tokens.readInt("clientNumber"));
        assertEquals(3344, tokens.readInt("accountNumber"));
        assertEquals(5566, tokens.readInt("subAccountNumber"));
        assertEquals("EX01", tokens.readRawString("exchangeCode"));
        assertEquals("G1", tokens.readRawString("productGroupCode"));
        assertEquals("SYMB01", tokens.readRawString("symbol"));
        assertEquals("20240118", tokens.readRawString("expirationDate"));
        assertEquals(2222233333l, tokens.readLong("quantityLong"));
        assertEquals(1111122222l, tokens.readLong("quantityShort"));

    }
}
