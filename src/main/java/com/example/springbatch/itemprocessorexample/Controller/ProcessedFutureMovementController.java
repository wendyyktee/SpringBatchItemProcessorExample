package com.example.springbatch.itemprocessorexample.Controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessedFutureMovementController {

    @Autowired
    JobLauncher jobLauncher;

    @Autowired
    Job helloWorldJob;

    @RequestMapping("/invokejob")
    public String handle() throws Exception {
        JobParameters jobParameters = new JobParametersBuilder().toJobParameters();
        jobLauncher.run(helloWorldJob, jobParameters);
        return "Task Batch job has been invoked";
    }
}
