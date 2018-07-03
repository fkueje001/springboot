package com.example.provider.dao;

import com.example.provider.entity.UserBasicInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserBasicInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(UserBasicInfo record);

    int insertSelective(UserBasicInfo record);

    UserBasicInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserBasicInfo record);

    int updateByPrimaryKeyWithBLOBs(UserBasicInfo record);

    int updateByPrimaryKey(UserBasicInfo record);

    List<UserBasicInfo> getUserBasicInfoList();
}