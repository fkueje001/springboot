package com.example.server.service;

import com.example.server.dao.cluster.CityDao;
import com.example.server.dao.master.UserDao;
import com.example.server.domain.City;
import com.example.server.domain.User;
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
