package com.example.provider.service;

import com.example.provider.entity.Token;

/**
 * @author : nangua
 * date:   2018-07-02 10:39
 * @description:
 */
public interface TokenService {

    Token queryByToken(String token, Integer tokenType);

    Token queryByToken(String token);
}
