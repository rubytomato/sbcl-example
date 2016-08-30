package com.example.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ServiceAlpha {

    @Autowired
    private JdbcTemplate jdbc;

    public void execute() {
    	System.out.println("*** alpha in ***");
    	if (jdbc == null) {
    		System.out.println("jdbc null");
    		return;
    	}
    	Map<String, Object> result = jdbc.queryForMap("select now() as current");
    	if (result == null) {
    		System.out.println("result null");
    		return;
    	}
    	result.forEach((k,v)->{
    		System.out.println("key:{" + k + "} value:{" + v + "}");
    	});
    	System.out.println("*** alpha out ***");
    }
}
