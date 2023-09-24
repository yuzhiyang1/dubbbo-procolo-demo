package com.yzy.service;

import org.apache.dubbo.config.annotation.DubboService;

/**
 * 使用Rest协议
 *
 * @author yzy
 * @date 2023/09/12
 */
@DubboService
public class UserServiceRestImpl implements UserRestService{


    /**
     * 登录
     *
     * @param name     名称
     * @param password 密码
     * @return {@code Boolean}
     */
    @Override
    public Boolean login(String name, String password) {
        System.out.println("name = " + name);
        System.out.println("password = " + password);
        return Boolean.FALSE;
    }
}
