/*
 * @(#)CityCervice.java  
 */
package com.jiuqi.restful.service;

import java.util.List;

import com.jiuqi.restful.domain.City;

/**
 *<p>Title:</p>
 * @author: zenglizhi
 * @date: 2018/04/24
 * @version: v1.0
 */
public interface CityCervice {
    /**
     * 获取城市信息列表
     *
     * @return
     */
    List<City> findAllCity();

    /**
     * 根据城市 ID,查询城市信息
     *
     * @param id
     * @return
     */
    City findCityById(Long id);

    /**
     * 新增城市信息
     *
     * @param city
     * @return
     */
    Long saveCity(City city);

    /**
     * 更新城市信息
     *
     * @param city
     * @return
     */
    Long updateCity(City city);

    /**
     * 根据城市 ID,删除城市信息
     *
     * @param id
     * @return
     */
    Long deleteCity(Long id);
}
