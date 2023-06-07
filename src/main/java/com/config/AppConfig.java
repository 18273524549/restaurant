package com.config;

import com.service.LoginService;
import com.service.impl.LoginServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
        // 定义LoginService对象的Bean
        @Bean
        public LoginService loginService() {
            return new LoginServiceImpl();
        }
    }

