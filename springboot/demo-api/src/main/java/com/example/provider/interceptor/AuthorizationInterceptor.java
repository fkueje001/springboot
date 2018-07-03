package com.example.provider.interceptor;

import com.alibaba.druid.util.StringUtils;
import com.example.provider.annotation.Login;
import com.example.provider.entity.Token;
import com.example.provider.exception.RRException;
import com.example.provider.service.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author : nangua
 * date:   2018-07-05 11:30
 * @description:
 */
@Component
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private TokenService tokenService;
    private static Logger logger= LoggerFactory.getLogger(AuthorizationInterceptor.class);

    public static final String USER_KEY = "userId";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Login annotation;
        if(handler instanceof HandlerMethod) {
            annotation = ((HandlerMethod) handler).getMethodAnnotation(Login.class);
        }else{
            return true;
        }

        if(annotation == null){
            return true;
        }
        logger.info("获取前端token请求参数:token:{},类型:{}", request.getHeader("token"),annotation.type());
        //从header中获取token
        String token = request.getHeader("token");
        //如果header中不存在token，则从参数中获取token
        if(StringUtils.isEmpty(token)){
            token = request.getParameter("token");
        }

        //token为空
        if(StringUtils.isEmpty(token)){
            throw new RRException("token不能为空",401);
        }
        logger.info("根据前端token查询响应结果:{}", token,annotation.type());
        //查询token信息
        Token tokenEntity = tokenService.queryByToken(token,annotation.type());
        if(tokenEntity == null || tokenEntity.getExpireTime().getTime() < System.currentTimeMillis()){
            throw new RRException("token失效，请重新登录",401);
        }
        //设置userId到request里，后续根据userId，获取用户信息
        request.setAttribute(USER_KEY, tokenEntity.getUserId());
        return true;
    }
}
