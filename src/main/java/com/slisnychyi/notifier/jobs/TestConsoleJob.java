package com.slisnychyi.notifier.jobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TestConsoleJob {
//    @Scheduled(cron = "*/1 * * * * *")
    public void print() {
        System.out.println("hello console...");
    }
}
