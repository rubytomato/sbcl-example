package com.example.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ServiceBeta {

    public void execute(final String... args) {
    	log.debug("*** beta in ***");

		if (args!= null && args.length > 0) {
			log.debug("UpperCase:{}", StringUtils.join(args, ",").toUpperCase());
		}

    	log.debug("*** beta out ***");
    }
}
