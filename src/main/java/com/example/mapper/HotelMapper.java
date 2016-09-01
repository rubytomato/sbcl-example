package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Hotel;

@Mapper
public interface HotelMapper {

	Hotel selectHotelById(final Long id);

	List<Hotel> selectByCityId(final Long cityId);

}
