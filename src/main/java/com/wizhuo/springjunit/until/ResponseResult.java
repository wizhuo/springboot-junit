package com.wizhuo.springjunit.until;

import lombok.Data;

import java.io.Serializable;

@Data
public class ResponseResult implements Serializable {
    private static final long serialVersionUID = 5452090877111883693L;
    private String status;
    private String message;
    private Object object;

    public static ResponseResult ok(String data){
        ResponseResult responseResult = new ResponseResult();
        responseResult.setStatus("200");
        responseResult.setMessage("成功");
        responseResult.setObject(data);
        return responseResult;
    }
}
