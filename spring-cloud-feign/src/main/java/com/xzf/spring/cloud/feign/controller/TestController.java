package com.xzf.spring.cloud.feign.controller;

import java.util.HashMap;
import java.util.Map;

import com.xzf.spring.cloud.feign.client.FeignClientAlone;
import com.xzf.spring.cloud.feign.client.FeignClientWithEureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/19.
 */
@RestController
public class TestController {

    @Autowired
    private FeignClientAlone feignClientOne;

    @Autowired
    private FeignClientWithEureka feignClientWithEureka;

    @GetMapping(value="/user/info/1")
    public String getUserInfo1(){
        return feignClientOne.getUserInfoById("12345");
    }

    @GetMapping(value = "/user/info/2")
    public String getUserInfo2(){
        return feignClientOne.getUserInfoById("12345");
    }
    
    @GetMapping(value = "/user/info")
    public String getUserInfo(String id,String name){
        return feignClientOne.getUserInfo(id, name);
    }
    @GetMapping(value = "/user/info1")
    public String getUserInfo1(String id,String name){
    	Map<String, Object> param=new HashMap<String, Object>();
    	param.put("id", id);
    	param.put("name", name);
        return feignClientOne.queryBy(param);
    }
}
