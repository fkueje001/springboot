package com.example.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.server.domain.CityDto;
import com.example.server.service.CityDubboService;

/**
 * 城市业务 Dubbo 服务层实现层
 *
 * Created by bysocket on 28/02/2017.
 */
// 注册为 Dubbo 服务
@Service(version = "1.0.0")
public class CityDubboServiceImpl implements CityDubboService {

    public CityDto findCityByName(String cityName) {
        return new CityDto("温岭","是我的故乡");
    }
}
