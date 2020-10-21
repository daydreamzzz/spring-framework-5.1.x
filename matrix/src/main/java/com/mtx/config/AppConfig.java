package com.mtx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.mtx.*")
@Import(MyImportSelector.class)
//@EnableAspectJAutoProxy(proxyTargetClass = true)
//@Import({TestImportSelector.class})
//@ImportResource("classpath:spring-config.xml")
public class AppConfig {

//    @Bean
//    public UserService userService(){
//        return new UserService();
//    }

}
