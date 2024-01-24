package com.example.springbatch.itemprocessorexample.BatchJob;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)
public class FutureTransactionReaderTest {

//    @Mock
//    private LineTokenizer lineTokenizer;

//    @Mock
//    private FutureTransactionFieldSetMapper transactionFieldSetMapper;
//
//    @Test
//    void contactReaderExpectAConfiguredReaderToBeReturned() throws NoSuchFieldException, IllegalAccessException {
//        assertEquals(1, 1);
//        String filename = "sampleInput.txt";
//        FutureTransactionReader readerInstance = new FutureTransactionReader(transactionFieldSetMapper);
//        assertThat(readerInstance).isInstanceOf(FutureTransactionReader.class);
//
//        var reader = readerInstance.reader(filename);
//
//        Class<?> transactionClass = reader.getClass();
//        Field field = transactionClass.getField("resource");
//        Resource fieldValue = (Resource) field.get(transactionReader);

//        FlatFileItemReader<FutureTransaction> transactions = transactionReader.read(filename);


//        assetEquals(resource.getFilename(), filename);
//        assertThat(resource.getFilename()).isEqualTo(filename);
//        assertThat(transactionReader.).isEqualTo(this.lineTokenizer);
//        assertThat(fieldSetMapper).isEqualTo(contactsFileRowMapper);

        //        var resource = field("resource").ofType(Resource.class).in(reader).get();
//        var lineTokenizer = field("tokenizer").ofType(FixedLengthTokenizer.class).in(transactionReader).get();
//        var fieldSetMapper = field("fieldSetMapper").ofType(FieldSetMapper.class).in(transactionReader).get();
//    }


}
