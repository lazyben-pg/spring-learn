package com.lazyben;

import com.lazyben.config.SpringConfiguration;
import com.lazyben.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void aspectTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.getUserById(1);
    }
}
