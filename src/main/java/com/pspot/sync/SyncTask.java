package com.pspot.sync;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SyncTask {
		
	    private final Logger logger = LoggerFactory.getLogger(getClass());
	    
	    @Scheduled(cron = "0/10 * * * * ?")
	    public void scheduler() {
	        logger.info("定时任务执行中......");
	    }
}
