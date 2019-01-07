package com.wizhuo.springjunit.controller;


import com.wizhuo.springjunit.bean.UserVO;
import com.wizhuo.springjunit.service.UserSerivce;
import com.wizhuo.springjunit.until.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserSerivce userSerivce;

    @RequestMapping("/list")
    public List<UserVO> list(){
        return userSerivce.list();

    }

    @RequestMapping("/login-check")
    public ResponseResult loginCheck(String username,String password){
        if("tom".equals(username)&&"123456".equals(password)){
            String welcome =username+",欢迎您进入小春论坛";
            return ResponseResult.ok(welcome);

        }
        return ResponseResult.ok("用户名或密码错误");


    }

    @PostMapping("/add")
    public Map addUser(@RequestBody UserVO user) {
        Map<String, Object> map = new HashMap<>();
        map.put("status", "200");
        map.put("data", user);
        return map;
    }



}
