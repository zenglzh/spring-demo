/*
 * @(#)CityDao.java  
 */
package com.jiuqi.restful.dao;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.jiuqi.restful.domain.City;

/**
 * <p>
 * Title:
 * </p>
 * 
 * @author: zenglizhi
 * @date: 2018/04/24
 * @version: v1.0
 */
public interface CityDao {
	/**
	 * 获取城市信息列表
	 *
	 * @return
	 */
	List<City> findAllCity();

	/**
	 * 根据城市 ID，获取城市信息
	 *
	 * @param id
	 * @return
	 */
	City findById(@Param("id") Long id);

	Long saveCity(City city);

	Long updateCity(City city);

	Long deleteCity(Long id);
}
