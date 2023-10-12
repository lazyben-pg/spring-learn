package com.lazyben;

import com.lazyben.config.SpringConfiguration;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void getBean() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Object myBean = applicationContext.getBean("mybean");
        System.out.println(myBean);
    }

    @Test
    public void circularDependencyTest() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        Object apple = applicationContext.getBean("apple");
        System.out.println(apple);
    }
}
