package com.devkursat.resttemplatecronjobsample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SchedulerTask {
    @Scheduled(fixedDelay = 3000)
    public void scheduler() {
        System.out.println("running something..");
    }
}
