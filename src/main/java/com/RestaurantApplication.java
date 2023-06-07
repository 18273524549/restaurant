package com;

import com.res.jfd.LoginView;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.awt.*;

@SpringBootApplication
@MapperScan("com.dao")
public class RestaurantApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {

        // 启动Spring Boot应用程序
        new RestaurantApplication().configure(new SpringApplicationBuilder(RestaurantApplication.class)).run(args);
    }
}