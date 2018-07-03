package com.example.provider.controller;

import com.example.provider.entity.Token;
import com.example.provider.entity.UserBasicInfo;
import com.example.provider.service.LoginService;
import com.example.provider.service.TokenService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.example.provider.domain.User;
import com.example.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @author : nangua
 * date:   2018-07-02 09:56
 * @description:
 */
@Api(description = "用户API", tags = "user")
@RestController
@RequestMapping("user")
public class TestController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private TokenService tokenService;
    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private UserService userService;
    /**
     * 登录
     *
     * @return
     */
    @PostMapping("login")
    @ApiOperation("登录")
    public ResponseEntity<Object> loginController() {
        //获取token
        Token token  = tokenService.queryByToken("0f0a1a11fcd543a3b247f5de0cb96172");
        return ResponseEntity.ok(token.getToken());
    }

    //@Login
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    @GetMapping("userInfo")
    public ResponseEntity<List<UserBasicInfo>> test(@ApiIgnore UserBasicInfo userBasicInfo){
        System.out.println(cacheManager.toString());
        userBasicInfo.getId();
        List<UserBasicInfo> userBasicInfos = loginService.getUserBasicInfoList();
        return ResponseEntity.ok(userBasicInfos);
    }

    //@Login
    @ApiOperation(value = "设置缓存信息", notes = "设置缓存信息1")
    @GetMapping("setcache")
    public ResponseEntity<User> setcache(){
        return ResponseEntity.ok(userService.findByName("aaa"));
    }

    @ApiOperation(value = "测试多数据源", notes = "测试多数据源")
    @GetMapping("testMutilDataSource")
    public ResponseEntity<User> testMutilDataSource(){
        loginService.getUserBasicInfoList();
        return ResponseEntity.ok(userService.findByName("aaa"));
    }
}
