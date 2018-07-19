package com.example.server.dao;

import com.example.server.entity.Token;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TokenMapper {
    int insert(Token record);

    int insertSelective(Token record);

    Token selectByTokenAndType(@Param("token")String token,@Param("tokenType")int tokenType);

    Token selectByToken(String token);
}