package com.springlearn.utils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@EnableScheduling
@Slf4j
public class MyTask {
    @Scheduled(fixedRate = 3000)
    public void publishMsg() {
        log.info("开始任务：" + LocalDateTime.now());
    }
}
