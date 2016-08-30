package com.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.ServiceAlpha;
import com.example.service.ServiceBeta;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Application {

	@Autowired
	ServiceAlpha alpha;

	@Autowired
	ServiceBeta beta;

	public static void main(String[] args) {
		log.debug(">>> call main");
        try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args)) {
        	Application app = ctx.getBean(Application.class);
        	app.run(args);
        }
        log.debug("<<< main end");
	}

	@PostConstruct
	public void init() {
		log.debug("application init");
	}

	@PreDestroy
	public void destory() {
		log.debug("application finish");
	}

	public void run(final String... args) {
		log.debug("application run");
		alpha.execute();
		beta.execute(args);
	}
	
}
