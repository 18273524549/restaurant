package com.service.impl;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dao.LoginDao;
import com.domain.Login;
import com.service.LoginService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class LoginServiceImpl extends ServiceImpl<LoginDao, Login>implements LoginService{

    @Autowired
    private LoginDao loginDao;

    @PostConstruct
    public void init() {
        System.out.println("loginDao: " + loginDao);
    }
    @Override
    public boolean login(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        try {
            QueryWrapper<Login> wrapper = new QueryWrapper<>();
            wrapper.eq("username", username).eq("password", password);
            if (loginDao == null) {
                throw new RuntimeException("LoginDao对象为空");
            }
            Login login = loginDao.selectOne(wrapper);
            return login != null;
        } catch (Exception e) {
            e.printStackTrace();
            // 或者使用日志输出异常信息
            // logger.error("登录时发生异常：", e);
            return false;
        }
    }
}

