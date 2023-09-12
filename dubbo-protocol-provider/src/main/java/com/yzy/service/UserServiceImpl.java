package com.yzy.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * 用户服务impl
 *
 * @author yzy
 * @date 2023/09/11
 */
@DubboService
@Service
public class UserServiceImpl implements UserService{
    @Override
    public Boolean login(String name, String password) {
        System.out.println("name = " + name);
        return null;
    }
}
