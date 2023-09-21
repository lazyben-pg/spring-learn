package com.lazyben.service;

import com.lazyben.annotation.MyAnnotation;
import com.lazyben.annotation.MyLog;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @MyLog
    public void getUserById(long id) {
        System.out.println("getUserById invoke");
    }

    @MyAnnotation
    public void getUserByName(String name) {
        System.out.println("getUserByName invoke");
    }
}
