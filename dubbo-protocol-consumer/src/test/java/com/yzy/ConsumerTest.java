package com.yzy;

import com.yzy.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 消费者试验
 *
 * @author yzy
 * @date 2023/09/11
 */
@SpringBootTest
public class ConsumerTest {

    @DubboReference
    UserService userService;

    /**
     *
     */
    @Test
    void test1() {
        Boolean login = userService.login("小明", "1234567");
        System.out.println("login = " + login);
    }
}
