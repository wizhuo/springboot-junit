package com.wizhuo.springjunit.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserListResModel implements Serializable {

    private Long id ;
    private String name;
    private Integer age;
}
