package com.group7.hms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
public class Application {
    public static void main(String args[]){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    ServletRegistrationBean getDispatchServlet(DispatcherServlet dispatcherServlet){
        return new ServletRegistrationBean(dispatcherServlet,"/");
    }
}
