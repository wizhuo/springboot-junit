package com.wizhuo.springjunit.service.impl;

import com.wizhuo.springjunit.bean.UserVO;
import com.wizhuo.springjunit.dao.UserDao;
import com.wizhuo.springjunit.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserSerivce {

    @Autowired
    private UserDao userDao;

    @Override
    public List<UserVO> list() {
        return userDao.list();
    }
}
