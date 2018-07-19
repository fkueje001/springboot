package com.example.server.service.impl;

import com.example.server.entity.Token;
import com.example.server.service.TokenService;
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
