package com.example.springbatch.itemprocessorexample.BatchJob;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BatchJobRunnerTest {

//    @Mock
//    private JobLauncher jobLauncher;
//
//    @Mock
//    private JobParameterConfig jobParametersConfig;
//
//    @Mock
//    private JobParameters jobParameters;
//
//    @Mock
//    private Map<String, JobParameter> jobParameterMap;
//
//    @Mock
//    private Job processFutureTransactionJob;
//
//    @Mock
//    private JobExecution jobExecution;
//
//    @InjectMocks
//    private BatchJobRunner batchJobRunner;
//
//    @Test
//    void runProcessFutureTransactionJobReturnWithCorrectJobParameterAndSuccess()
//            throws ExecutionException, InterruptedException, JobInstanceAlreadyCompleteException,
//                   JobExecutionAlreadyRunningException, JobParametersInvalidException, JobRestartException {
//
//        final var jobId = 109L;
//        given(jobParametersConfig.getJobParameters()).willReturn(jobParameters);
//        willReturn(jobExecution).given(jobLauncher)
//                                .run(processFutureTransactionJob, jobParameters);
//        given(jobExecution.getJobId()).willReturn(jobId);
//
//        final var result = batchJobRunner.runProcessingContactsBatchJob();
//
//        assertThat(result.get()).isEqualTo(jobId);
//        verify(jobLauncher).run(processFutureTransactionJob, jobParameters);
//        verifyNoMoreInteractions(jobLauncher, jobParameters, processFutureTransactionJob);
//    }
//
//    @Test
//    void runProcessFutureTransactionJobReturnWithJobParametersInvalidException()
//            throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException,
//                   JobRestartException {
//
//        Exception exception = new JobParametersInvalidException("Invalid Job Parameter");
//        given(jobParametersConfig.getJobParameters()).willReturn(jobParameters);
//        given(jobLauncher.run(processFutureTransactionJob, jobParameters)).willThrow(exception);
//
//        final var thrown = catchThrowable(() -> batchJobRunner.runProcessingContactsBatchJob());
//
//        assertThat(thrown)
//                .isInstanceOf(JobException.class)
//                .hasMessage("Invalid job parameters.")
//                .hasCause(exception)
//                .hasRootCauseMessage("Invalid Job Parameter");
//
//        verifyNoMoreInteractions(jobLauncher, processFutureTransactionJob);
//    }
    
//    @Test
//    void runProcessFutureTransactionJobReturnWithJobExecutionAlreadyRunningException()
//            throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException,
//                   JobRestartException {
//        Exception exception = new JobExecutionAlreadyRunningException("Job already running");
//        JobParameter jobParameter = new JobParameter("test");
//
//        given(jobParametersConfig.getJobParameters()).willReturn(jobParameters);
//        given(jobParameters.getParameters()).willReturn(jobParameterMap);
//        given(jobParameterMap.get("filename")).willReturn(jobParameter);
//        given(jobLauncher.run(processFutureTransactionJob, jobParameters)).willThrow(exception);
//
//        final var thrown = catchThrowable(() -> batchJobRunner.runProcessingContactsBatchJob());
//
//        assertThat(thrown)
//                .isInstanceOf(JobException.class)
//                .hasMessage("Job with filename=file.txt already running.")
//                .hasCause(exception)
//                .hasRootCauseMessage("Job already running");
//
//        verifyNoMoreInteractions(jobLauncher, processFutureTransactionJob);
//    }
//
//    @Test
//    void runProcessFutureTransactionJobReturnWithJobRestartException()
//            throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException,
//                   JobRestartException {
//        Exception exception = new JobRestartException("Job was not started");
//        final var jobParameter = new JobParameter("file.txt");
//        given(jobParametersConfig.getJobParameters()).willReturn(jobParameters);
//        given(jobParameters.getParameters()).willReturn(jobParameterMap);
//        given(jobParameterMap.get("filename")).willReturn(jobParameter);
//        given(jobLauncher.run(processFutureTransactionJob, jobParameters)).willThrow(exception);
//
//        final var thrown = catchThrowable(() -> batchJobRunner.runProcessingContactsBatchJob());
//
//        assertThat(thrown)
//                .isInstanceOf(JobException.class)
//                .hasMessage("Job with filename=file.txt was not started.")
//                .hasCause(exception)
//                .hasRootCauseMessage("Job was not started");
//
//        verifyNoMoreInteractions(jobLauncher, processFutureTransactionJob);
//    }
//
//    @Test
//    void runProcessFutureTransactionJobReturnWithJobInstanceAlreadyCompleteException()
//            throws JobInstanceAlreadyCompleteException, JobExecutionAlreadyRunningException, JobParametersInvalidException,
//                   JobRestartException {
//        Exception exception = new JobInstanceAlreadyCompleteException("Job was already completed");
//        final var jobParameter = new JobParameter("file.txt");
//        given(jobParametersConfig.getJobParameters()).willReturn(jobParameters);
//        given(jobParameters.getParameters()).willReturn(jobParameterMap);
//        given(jobParameterMap.get("filename")).willReturn(jobParameter);
//        given(jobLauncher.run(processFutureTransactionJob, jobParameters)).willThrow(exception);
//
//        final var thrown = catchThrowable(() -> batchJobRunner.runProcessingContactsBatchJob());
//
//        assertThat(thrown)
//                .isInstanceOf(JobException.class)
//                .hasMessage("Job with filename=file.txt was already completed.")
//                .hasCause(exception)
//                .hasRootCauseMessage("Job was already completed");
//
//        verifyNoMoreInteractions(jobLauncher, processFutureTransactionJob);
//    }

    
}
