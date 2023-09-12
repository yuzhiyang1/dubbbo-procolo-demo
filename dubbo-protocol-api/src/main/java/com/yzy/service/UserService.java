package com.yzy.service;

/**
 * 用户服务
 *
 * @author yzy
 * @date 2023/09/11
 */
public interface UserService {

    /**
     * 登录
     *
     * @param name     名称
     * @param password 密钥
     * @return {@code Boolean}
     */
    Boolean login(String name, String password);
}
