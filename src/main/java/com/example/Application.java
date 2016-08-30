package com.example;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.service.ServiceAlpha;

@SpringBootApplication
public class Application {

	@Autowired
	ServiceAlpha alpha;

	public static void main(String[] args) {
		System.out.println(">>> call main");
        try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args)) {
        	Application app = ctx.getBean(Application.class);
        	app.run(args);
        }
		System.out.println("<<< main end");
	}

	@PostConstruct
	public void init() {
		System.out.println("application init");
	}

	public void run(String... args) {
		System.out.println("run");
		System.out.println(StringUtils.join(args, ","));
		alpha.execute();
	}

	
}
