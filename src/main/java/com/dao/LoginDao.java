package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.Login;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.dao")
@Mapper
public interface LoginDao extends BaseMapper<Login> {

}
