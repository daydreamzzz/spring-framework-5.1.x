package com.mtx;

import com.mtx.bean.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(UserService.class);
        ac.refresh();

        UserService bean = ac.getBean(UserService.class);
        System.out.println(bean);

    }
}
