package com.example.server.service;

import com.example.server.entity.Token;

/**
 * @author : nangua
 * date:   2018-07-02 10:39
 * @description:
 */
public interface TokenService {

    Token queryByToken(String token, Integer tokenType);

    Token queryByToken(String token);
}
