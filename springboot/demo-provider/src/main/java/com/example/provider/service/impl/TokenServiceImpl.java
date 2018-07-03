package com.example.provider.service.impl;

import com.example.provider.dao.TokenMapper;
import com.example.provider.entity.Token;
import com.example.provider.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("tokenService")
public class TokenServiceImpl implements TokenService {

	//@Autowired
	//private TokenMapper tokenMapper;

	@Override
	public Token queryByToken(String token, Integer tokenType) {
		//return tokenMapper.selectByTokenAndType(token,tokenType);
		return null;
	}

	@Override
	public Token queryByToken(String token) {
		return null ;
		//return tokenMapper.selectByToken(token);
	}
}
