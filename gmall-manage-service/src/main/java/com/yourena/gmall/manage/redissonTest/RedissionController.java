package com.yourena.gmall.manage.redissonTest;

import com.yourena.gmall.manage.redissonTest.service.RedissonService;
import com.yourena.gmall.manage.util.RedisUtil;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RedissionController {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private RedissonService redissonService;

    @Autowired
    private RedissonClient redissonClient;

    public String testRedisson() {
        RLock lock = redissonClient.getLock("lock");
        return null;
    }
}
