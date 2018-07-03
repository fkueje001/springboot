package com.example.provider.entity;

import java.util.Date;

public class Token {
    private String userId;

    private String token;

    private Date expireTime;

    private Date updateTime;

    private Boolean tokenType;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getTokenType() {
        return tokenType;
    }

    public void setTokenType(Boolean tokenType) {
        this.tokenType = tokenType;
    }
}