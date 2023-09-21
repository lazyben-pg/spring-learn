package com.lazyben.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.lazyben")
@EnableAspectJAutoProxy
public class SpringConfiguration {
}
