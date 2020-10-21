package com.mtx;

import com.mtx.bean.IndexService;
import com.mtx.bean.UserService;
import com.mtx.config.AppConfig;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test01 {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.register(AppConfig.class);
        ac.refresh();

        UserService bean = ac.getBean(UserService.class);
        System.out.println(bean);
//
//        IndexService index = ac.getBean(IndexService.class);

    }
}
