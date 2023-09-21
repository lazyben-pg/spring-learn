package com.lazyben.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Data
@Component
public class Account {
    @Value("5000")
    private BigDecimal balance;
}
