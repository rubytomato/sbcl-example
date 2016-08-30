package com.example.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ServiceAlpha {

    @Autowired
    private JdbcTemplate jdbc;

    public void execute() {
    	log.debug("*** alpha in ***");

    	if (jdbc == null) {
    		throw new RuntimeException("JdbcTemplate is null");
    	}
    	Map<String, Object> result = jdbc.queryForMap("select now() as current");
    	if (result == null) {
    		log.debug("result null");
    		return;
    	}
    	result.forEach((k,v)->{
    		log.debug("key:{} value:{}", k, v);
    	});

    	log.debug("*** alpha out ***");
    }
}
