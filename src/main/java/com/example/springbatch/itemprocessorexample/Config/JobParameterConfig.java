package com.example.springbatch.itemprocessorexample.Config;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
public class JobParameterConfig {
    private static final String DATE_CONTEXT_KEY = "date";
    private static final String FILE_NAME_CONTEXT_KEY = "filename";

    //todo to remove
    private static final String FILE_NAME = "test.txt";

    @Bean
    public JobParameters getJobParameters() {
        final var jobParametersBuilder = new JobParametersBuilder();
        jobParametersBuilder.addString(FILE_NAME_CONTEXT_KEY, FILE_NAME);
        jobParametersBuilder.addDate(DATE_CONTEXT_KEY, new Date());
        return jobParametersBuilder.toJobParameters();
    }

}
