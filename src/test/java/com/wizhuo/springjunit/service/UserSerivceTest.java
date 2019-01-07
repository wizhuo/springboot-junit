package com.wizhuo.springjunit.service;

import com.wizhuo.springjunit.SpringbootJunitApplication;
import com.wizhuo.springjunit.bean.UserVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;



@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJunitApplication.class)
public class UserSerivceTest {

    @Autowired
    private UserSerivce userSerivce;

    @Test
    public void list() {
      List<UserVO> list= userSerivce.list();
        System.out.println(list);
    }
}