package com.example.server.service.impl;

import com.example.server.entity.UserBasicInfo;
import com.example.server.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author : nangua
 * date:   2018-06-30 16:16
 * @description:
 */
@Service
@CacheConfig(cacheNames = "cache")
public class LoginServiceImpl implements LoginService {

   // @Resource
   // private UserBasicInfoMapper userBasicInfoMapper;

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RestTemplate restTemplate;

    //@Cacheable(key = "'userInfo'")
    @Override
    public List<UserBasicInfo> getUserBasicInfoList() {
        System.out.println("aaaa");
        redisTemplate.opsForValue().set("hello","haha");
        return null;//
        // return userBasicInfoMapper.getUserBasicInfoList();
    }



    @Override
    public void putCacheData(UserBasicInfo userBasicInfo) {
        //userBasicInfoMapper.getUserBasicInfoList();
        //System.out.println(userBasicInfo.getNickName());
    }

    @Override
    public UserBasicInfo getUserBasicInfo(String userId) {
        return null;//
        // return userBasicInfoMapper.selectByPrimaryKey(userId);
    }
}
