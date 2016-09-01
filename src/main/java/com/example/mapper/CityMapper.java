package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.domain.City;

@Mapper
public interface CityMapper {

	City selectCityById(final Long id);

    @Select("SELECT * FROM city WHERE state = #{state}")
    List<City> findByState(@Param("state") String state);

}
