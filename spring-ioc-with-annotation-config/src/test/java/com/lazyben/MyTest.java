package com.lazyben;

import com.lazyben.config.SpringConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void getUserWithXmlConfigTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Object user = applicationContext.getBean("user");
        System.out.println(user);
    }

    @Test
    public void getUserWithAnnotationConfigTest(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Object user = applicationContext.getBean("user");
        System.out.println(user);
    }
}
