package com.lazyben.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Data
@Component
public class User {
    @Value("2")
    private Long id;

    @Value("mary")
    private String name;

    @Resource
    private Account account;
}
