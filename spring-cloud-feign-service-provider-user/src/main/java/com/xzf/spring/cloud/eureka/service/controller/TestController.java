package com.xzf.spring.cloud.eureka.service.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/6/19.
 */
@RestController
@RequestMapping(value = "/user")
public class TestController {

    @GetMapping(value = "/{id}")
    public String getUserInfoById(@PathVariable(value="id") String userId){
        //根据id,查user信息
        return "xiezhefeng";
    }
    //多个参数
    @GetMapping(value = "/{id}/{name}")
    public String getUserInfo(@PathVariable(value="id") String id,@PathVariable(value="name") String name){
        //根据id,查user信息
        return "测试多个参数"+id+name;
    }
    //多个参数
    @GetMapping(value = "/test")
    public String queryBy(@RequestParam Map<String, Object> param){
        //根据id,查user信息
        return "测试多个参数1"+param.get("name");
    }
}
