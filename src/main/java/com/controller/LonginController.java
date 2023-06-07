package com.controller;

import com.dao.LoginDao;
import com.domain.Login;
import com.service.LoginService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/login")
public class LonginController {
    @Autowired
    private LoginService loginService;
    @GetMapping
    public List<Login> getAll(){
        return loginService.list();
    }
    @PostMapping
    public Boolean save(@RequestBody Login login){
        return loginService.save(login);
    }
    @PutMapping
    public Boolean update(@RequestBody Login login){
        return loginService.updateById(login);
    }
    @DeleteMapping("{id}")
    public Boolean delete(@PathVariable Integer id){
        return loginService.removeById(id);
    }
    @GetMapping("{id}")
    public Login getById(@PathVariable  Integer id){
        return loginService.getById(id);
    }
}
