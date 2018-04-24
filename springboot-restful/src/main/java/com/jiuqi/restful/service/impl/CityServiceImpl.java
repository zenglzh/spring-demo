/*
 * @(#)CityServiceImpl.java  
 */
package com.jiuqi.restful.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiuqi.restful.dao.CityDao;
import com.jiuqi.restful.domain.City;
import com.jiuqi.restful.service.CityCervice;

/**
 * <p>
 * Title:
 * </p>
 * 
 * @author: zenglizhi
 * @date: 2018/04/24
 * @version: v1.0
 */
@Service
public class CityServiceImpl implements CityCervice{
	@Autowired
	private CityDao cityDao;

	@Override
	public List<City> findAllCity() {
		return cityDao.findAllCity();
	}

	@Override
	public City findCityById(Long id) {
		return cityDao.findById(id);
	}

	@Override
	public Long saveCity(City city) {
		return cityDao.saveCity(city);
	}

	@Override
	public Long updateCity(City city) {
		return cityDao.updateCity(city);
	}

	@Override
	public Long deleteCity(Long id) {
		return cityDao.deleteCity(id);
	}
}
