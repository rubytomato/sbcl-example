package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.domain.City;
import com.example.domain.Hotel;
import com.example.mapper.CityMapper;
import com.example.mapper.HotelMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ServiceGamma {

	@Autowired
	private CityMapper cityMapper;

	@Autowired
	private HotelMapper hotelMapper;

    public void execute() {
    	log.debug("*** gamma in ***");

    	City city = cityMapper.selectCityById(1L);
    	log.debug("city:{}", city);

    	List<City> cityList = cityMapper.findByState("CA");
    	if (cityList != null) {
    		cityList.forEach(c -> {
    			log.debug("city:{}",c);
    		});
    	} else {
    		log.debug("city list is null");
    	}

    	Hotel hotel = hotelMapper.selectHotelById(1L);
    	log.debug("hotel:{}", hotel);

    	List<Hotel> hotelList = hotelMapper.selectByCityId(1L);
    	if (hotelList != null) {
    		hotelList.forEach(h -> {
    			log.debug("hotel:{}",h);
    		});
    	} else {
    		log.debug("hotel list is null");
    	}

    	log.debug("*** gamma out ***");
    }

}
