package com.lazyben.entity;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

//@Component("mybean")
public class MyBeanFactory implements FactoryBean<MyBean> {
    @Override
    public MyBean getObject() throws Exception {
        return new MyBean();
    }

    @Override
    public Class<?> getObjectType() {
        return MyBean.class;
    }
}
