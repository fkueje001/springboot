package com.example.provider.service;

import com.example.provider.entity.UserBasicInfo;

import java.util.List;

/**
 * @author : nangua
 * date:   2018-06-30 16:16
 * @description:
 */
public interface LoginService {

    List<UserBasicInfo> getUserBasicInfoList();

    UserBasicInfo getUserBasicInfo(String userId);

    void putCacheData(UserBasicInfo userBasicInfo);
}
