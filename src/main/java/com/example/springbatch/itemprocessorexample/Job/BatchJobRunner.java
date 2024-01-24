package com.example.springbatch.itemprocessorexample.Job;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class BatchJobRunner {
    private static final String FILE_NAME_CONTEXT_KEY = "filename";
//
//    private final JobLauncher simpleJobLauncher;
//    private final JobParameterConfig jobParameterConfig;
//    private final Job transactionJob;
//
//    @Async
//    public CompletableFuture<Long> runProcessingContactsBatchJob() {
//        return CompletableFuture.completedFuture(
//                Objects.requireNonNull(runJob(transactionJob, jobParameterConfig.getJobParameters()))
//                       .getJobId());
//    }
//
//    private JobExecution runJob(Job job, JobParameters parameters) {
//        try {
//            return simpleJobLauncher.run(job, parameters);
//        }
//        catch (JobExecutionAlreadyRunningException e) {
//            throw new JobException(String.format("Job with filename=%s already running.",
//                                                 parameters.getParameters()
//                                                           .get(FILE_NAME_CONTEXT_KEY)), e);
//        }
//        catch (JobRestartException e) {
//            throw new JobException(String.format("Job with filename=%s was not started.",
//                                                 parameters.getParameters()
//                                                           .get(FILE_NAME_CONTEXT_KEY)), e);
//        }
//        catch (JobInstanceAlreadyCompleteException e) {
//            throw new JobException(String.format("Job with filename=%s was already completed.",
//                                                 parameters.getParameters()
//                                                           .get(FILE_NAME_CONTEXT_KEY)), e);
//        }
//        catch (JobParametersInvalidException e) {
//            throw new JobException("Invalid job parameters.", e);
//        }
//    }
}
