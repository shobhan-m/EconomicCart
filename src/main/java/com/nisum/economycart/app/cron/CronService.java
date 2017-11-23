package com.nisum.economycart.app.cron;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.nisum.economycart.app.rest.ProductRestService;

@SpringBootApplication(scanBasePackages="com.nisum.economycart.app")
@ComponentScan({"com.nisum.economycart.app"})
@EnableAutoConfiguration
@Configuration
@EnableJpaRepositories(basePackages="com.nisum.economycart.app.repositroy")
@EnableScheduling

public class CronService {

	@Autowired
	ProductRestService productRestService;

	@Scheduled(cron="0/10 * * * * ?")
	public void execute() {
		System.out.println("test"+productRestService);
		
		productRestService.callCron();
	}

}
