package com.lazyben.entity;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Apple {
    @Value("apple")
    private String name;

    @Resource
    private Banana banana;

    public Apple() {
        System.out.println("instantiate apple");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }
}
