package com.example.server.service;

import com.example.server.domain.CityDto;

/**
 * 城市业务 Dubbo 服务层
 *
 * Created by bysocket on 28/02/2017.
 */
public interface CityDubboService {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    CityDto findCityByName(String cityName);
}
