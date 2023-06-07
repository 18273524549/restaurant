package com.example;

import com.dao.LoginDao;
import com.domain.Login;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoginDaoTest {

    @Autowired
    private LoginDao loginDao;

    @Test
    void testInsert(){
        Login login =new Login();
        login.setUsername("lyjdsb");
        login.setPassword("cx666");
        loginDao.insert(login);
    }
    @Test
    void testSelectAll(){
        loginDao.selectList(null);
    }
}
