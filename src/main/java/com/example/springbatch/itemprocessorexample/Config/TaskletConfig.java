package com.example.springbatch.itemprocessorexample.Config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.support.DefaultBatchConfiguration;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import com.example.springbatch.itemprocessorexample.TransactionLineProcessor;
import com.example.springbatch.itemprocessorexample.TransactionLineReader;
import com.example.springbatch.itemprocessorexample.TransactionLineWriter;

@Configuration
public class TaskletConfig extends DefaultBatchConfiguration {


    @Bean
    protected Step readLines(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("readLines", jobRepository)
                .tasklet(new TransactionLineReader(), transactionManager)
                .build();
    }

    @Bean
    protected Step processLines(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("processLines", jobRepository)
                .tasklet(new TransactionLineProcessor(), transactionManager)
                .build();
    }

    @Bean
    protected Step writeLines(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new StepBuilder("writeLines", jobRepository)
                .tasklet(new TransactionLineWriter(), transactionManager)
                .build();
    }

    @Bean
    public Job job(JobRepository jobRepository, PlatformTransactionManager transactionManager) {
        return new JobBuilder("taskletsJob", jobRepository)
                .start(readLines(jobRepository, transactionManager))
                .next(processLines(jobRepository, transactionManager))
                .next(writeLines(jobRepository, transactionManager))
                .build();
    }

//    @Bean
//    public JobLauncherTestUtils jobLauncherTestUtils() {
//        return new JobLauncherTestUtils();
//    }
//
//    @Bean
//    public JobRepository jobRepository() {
//        JobRepositoryFactoryBean factory = new JobRepositoryFactoryBean();
//        factory.setDataSource(dataSource());
//        factory.setTransactionManager(transactionManager());
//        return factory.getObject();
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("org.sqlite.JDBC");
//        dataSource.setUrl("jdbc:sqlite:repository.sqlite");
//        return dataSource;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        return new ResourcelessTransactionManager();
//    }
//
//    @Bean
//    public JobLauncher jobLauncher() {
//        TaskExecutorJobLauncher jobLauncher = new TaskExecutorJobLauncher();
//        jobLauncher.setJobRepository(jobRepository());
//        return jobLauncher;
//    }

}
