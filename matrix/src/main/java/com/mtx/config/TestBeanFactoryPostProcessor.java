package com.mtx.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

//@Component
//public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
//
//    @Override
//    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        AbstractBeanDefinition userService = (AbstractBeanDefinition) beanFactory.getBeanDefinition("userService");
//        userService.setAutowireMode(AbstractBeanDefinition.AUTOWIRE_BY_TYPE);
//    }
//}
