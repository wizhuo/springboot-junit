package com.wizhuo.springjunit.dao;


import com.wizhuo.springjunit.bean.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<UserVO> list() {
        String sql = "select * from user";
        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
        List<UserVO> userVOS = new ArrayList<>();
        for(Map<String,Object> map:list){
            UserVO userVO = new UserVO();
            userVO.setAge((Integer) map.get("age"));
            userVO.setName((String) map.get("name"));
            userVO.setId((Long) map.get("id"));
            userVOS.add(userVO);

        }
       return userVOS;
    }
}
