package com.example.springbatch.itemprocessorexample.Config;

import lombok.AllArgsConstructor;

//@Configuration
@AllArgsConstructor
public class BatchJobConfig
{

//
//    private final FlatFileItemReader<FutureTransaction> futureTransactionReader;
//
//    @Bean
//    public Job job(JobRepository jobRepository) throws Exception {
//        return new JobBuilder("job", jobRepository)
//                .start(generateSummaryReportFromInputStep(jobRepository, getTransactionManager()))
//                .build();
//    }
//
//    @Bean
//    Step generateSummaryReportFromInputStep(JobRepository jobRepository, PlatformTransactionManager transactionManager) throws Exception {
//        return new StepBuilder("generateSummaryReportFromInputStep", jobRepository)
//                .<FutureTransaction, String>chunk(10, transactionManager)
//                .reader(futureTransactionReader)
//                .processor(itemProcessor())
//                .writer(itemWriter())
//                .build();
//    }
//
////    @Bean
////    protected FlatFileItemReader<FutureTransactionReader> itemReader() {
////        return new FutureTransactionReader();
////    }
//
//    @Bean
//    protected ItemProcessor itemProcessor() {
//        return new FutureTransactionProcessor();
//    }
//
//    @Bean
//    protected FlatFileItemWriter<TransactionSummary> itemWriter() throws Exception {
//        FileSystemResource resource = new FileSystemResource("resources/output.csv");
//        BeanWrapperFieldExtractor<TransactionSummary> fieldExtractor = new BeanWrapperFieldExtractor<>();
//        fieldExtractor.setNames(new String[]{"clientInformation", "productInformation", "totalTransactionAmount"});
//        fieldExtractor.afterPropertiesSet();
//
//        DelimitedLineAggregator<TransactionSummary> lineAggregator = new DelimitedLineAggregator<>();
//        lineAggregator.setDelimiter(",");
//        lineAggregator.setFieldExtractor(fieldExtractor);
//
//        return new FlatFileItemWriterBuilder<TransactionSummary>()
//                .name("futureMovementWriter")
//                .resource(resource)
//                .lineAggregator(lineAggregator)
//                .build();
//    }


}
