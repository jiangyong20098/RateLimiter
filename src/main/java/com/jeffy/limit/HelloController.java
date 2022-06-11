package com.jeffy.limit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 控制器
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    @RateLimiterAnnonation(time = 5, count = 3, limitType = LimitType.IP)
    public String hello() {
        return "hello >>> " + new Date();
    }

    @GetMapping("/hi")
    @RateLimiterAnnonation(time = 5, count = 3, limitType = LimitType.DEFAULT)
    public String hi() {
        return "hi >>> " + new Date();
    }
}