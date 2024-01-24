package com.example.springbatch.itemprocessorexample.BatchJob;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.test.context.ContextConfiguration;
import com.example.springbatch.itemprocessorexample.Config.TaskletConfig;


@EnableAutoConfiguration
@ContextConfiguration(classes = TaskletConfig.class)
public class FutureTransactionTaskletIntegrationTest {

//    @Autowired
//    JobLauncher jobLauncher;
//
//    @Autowired
//    Job job;
//
//    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
//
//    @Test
//    public void givenTaskletsJob_whenJobEnds_thenStatusCompleted()
//            throws Exception {
//        JobParameters jobParameters = new JobParametersBuilder()
//                .addString("time", format.format(Calendar.getInstance().getTime())).toJobParameters();
//        JobExecution jobExecution = jobLauncher.run(job, jobParameters);
//        assertEquals(ExitStatus.COMPLETED, jobExecution.getExitStatus());
//    }
}
