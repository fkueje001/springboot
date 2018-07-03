package com.example.provider.resovler;

import com.example.provider.annotation.Login;
import com.example.provider.annotation.LoginUser;
import com.example.provider.entity.Token;
import com.example.provider.entity.UserBasicInfo;
import com.example.provider.interceptor.AuthorizationInterceptor;
import com.example.provider.service.LoginService;
import com.example.provider.service.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * @author : nangua
 * date:   2018-07-11 11:20
 * @description:
 */
@Component
public class LoginUserHandlerMethodArgumentResolver implements HandlerMethodArgumentResolver {
    @Autowired
    private LoginService loginService;


    @Autowired
    private TokenService tokenService;
    private static Logger logger= LoggerFactory.getLogger(LoginUserHandlerMethodArgumentResolver.class);

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return (parameter.getParameterType().isAssignableFrom(UserBasicInfo.class))
                && parameter.hasParameterAnnotation(LoginUser.class);
    }

    @Override
    public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer container,
                                  NativeWebRequest request, WebDataBinderFactory factory) throws Exception {
        Login annotation;
        //获取用户ID
        Object object = request.getAttribute(AuthorizationInterceptor.USER_KEY, RequestAttributes.SCOPE_REQUEST);
        if (object == null) {
            //从header中获取token
            String token = request.getHeader("token");
            logger.info("根据前端token查询响应结果:{}", token);

            //查询token信息
            Token tokenEntity =tokenService.queryByToken(token);
            if(null==tokenEntity){
                return null;
            }
            object=tokenEntity.getUserId();
        }

        if (parameter.getParameterType().isAssignableFrom(UserBasicInfo.class)) {
            return loginService.getUserBasicInfo(object.toString());
        }
        return null;
    }
}
