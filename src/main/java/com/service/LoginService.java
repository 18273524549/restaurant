package com.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.domain.Login;

public interface LoginService extends IService<Login> {
    boolean login(String username, String password);
}