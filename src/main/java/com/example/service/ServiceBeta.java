package com.example.service;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.FastDateFormat;
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

		Date current = new Date();
		FastDateFormat fdf = FastDateFormat.getInstance("yyyy-MM-dd HH:mm:ss");
		String currentStr = fdf.format(current);
		log.debug("current:{}", currentStr);

    	log.debug("*** beta out ***");
    }
}
