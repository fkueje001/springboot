package com.example.provider.service.impl;

import com.example.provider.dao.cluster.CityDao;
import com.example.provider.dao.master.UserDao;
import com.example.provider.domain.City;
import com.example.provider.domain.User;
import com.example.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户业务实现层
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao; // 主数据源

    @Autowired
    private CityDao cityDao; // 从数据源

    public User findByName(String userName) {
        User user = userDao.findByName("hello");
        City city = cityDao.findByName("永州");
        user.setCity(city);
        return user;
    }
}
