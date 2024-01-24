package com.example.springbatch.itemprocessorexample.Job;

import com.example.springbatch.itemprocessorexample.FileTransformer.FutureTransactionFieldSetMapper;
import com.example.springbatch.itemprocessorexample.FileTransformer.FutureTransactionTokenizer;
import com.example.springbatch.itemprocessorexample.Model.FutureTransaction;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.LineTokenizer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;

@Configuration
@AllArgsConstructor
public class FutureTransactionReader {

    private static final Logger LOGGER = LoggerFactory.getLogger(FutureTransactionReader.class);

    private final FutureTransactionFieldSetMapper transactionFieldSetMapper;
    private final FutureTransactionTokenizer tokenizer;

    @Bean
    @StepScope
    public FlatFileItemReader<FutureTransaction> reader(@Value("#{jobParameters['filename']}") String input) {
        DefaultLineMapper<FutureTransaction> lineMapper = createFieldSetMapper(tokenizer.createTokenizer());
        return createReader(lineMapper, input);
    }

    private DefaultLineMapper<FutureTransaction> createFieldSetMapper(LineTokenizer tokenizer) {
        DefaultLineMapper<FutureTransaction> lineMapper = new DefaultLineMapper<>();
        lineMapper.setLineTokenizer(tokenizer);
        lineMapper.setFieldSetMapper(transactionFieldSetMapper);

        return lineMapper;
    }

    public FlatFileItemReader<FutureTransaction> createReader(DefaultLineMapper<FutureTransaction> lineMapper, String fileName) {
        FlatFileItemReaderBuilder<FutureTransaction> builder = new FlatFileItemReaderBuilder<>();
        return builder
                .name("futureTransactionReader")
                .resource(new FileSystemResource(fileName))
                .lineMapper(lineMapper)
                .build();
    }
}
