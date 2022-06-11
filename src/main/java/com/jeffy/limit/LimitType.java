package com.jeffy.limit;

/**
 * 限流类型
 * 限流分为两种情况：
 *
 * 针对当前接口的全局性限流，例如：该接口可以在1分钟内访问100次。
 * 针对某一个IP地址的限流，例如某个IP地址可以在1分钟内访问100次。
 */
public enum LimitType {
    /**
     * 默认策略全局限流
     */
    DEFAULT,
    /**
     * 根据请求者IP进行限流
     */
    IP
}