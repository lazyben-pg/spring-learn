package com.lazyben.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Banana {
    @Value("banana")
    private String name;

    @Resource
    private Apple apple;

    public void setName(String name) {
        this.name = name;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }
}
