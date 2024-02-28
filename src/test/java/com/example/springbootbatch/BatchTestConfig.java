package com.example.springbootbatch;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.batch.core.Job;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;

@Configuration
public class BatchTestConfig {
    @Bean
    public JobLauncherTestUtils helloJobLauncherTestUtils(Job helloJob) {
        JobLauncherTestUtils utils = new JobLauncherTestUtils();
        utils.setJob(helloJob);
        return utils;
    }

    @Bean
    public JobLauncherTestUtils hello2JobLauncherTestUtils(Job hello2Job) {
        JobLauncherTestUtils utils = new JobLauncherTestUtils();
        utils.setJob(hello2Job);
        return utils;
    }

    @Bean
    public JobLauncherTestUtils hello3JobLauncherTestUtils(Job hello3Job) {
        JobLauncherTestUtils utils = new JobLauncherTestUtils();
        utils.setJob(hello3Job);
        return utils;
    }
}