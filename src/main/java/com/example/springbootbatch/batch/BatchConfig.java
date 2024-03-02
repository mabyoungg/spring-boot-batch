package com.example.springbootbatch.batch;

import com.example.springbootbatch.global.app.AppConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class BatchConfig {
    private final BatchService batchService;

    @Scheduled(cron = "0 0 1 * * *") // 운영
    // @Scheduled(cron = "0 * * * * *") // 테스트
    public void runMakeProductLogJob() {
        if (AppConfig.isNotProd()) return;

        LocalDateTime startDate = LocalDateTime
                .now()
                .minusDays(1)
                .withHour(0)
                .withMinute(0)
                .withSecond(0)
                .withNano(0);

        LocalDateTime endDate = LocalDateTime
                .now()
                .minusDays(1)
                .withHour(23)
                .withMinute(59)
                .withSecond(59)
                .withNano(999999);

        batchService.runMakeProductLogJob(startDate, endDate);
    }
}