package com.xzf.spring.cloud.feign.client;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 不适用Eureka，独立使用Feign调用远程服务
 *
 */
@FeignClient(name="user-center",url="http://localhost:8888")
public interface FeignClientAlone {

    @GetMapping(value = "/user/{id}")
    public String getUserInfoById(@PathVariable(value="id") String userId);
    @GetMapping(value = "/user/{id}/{name}")
    public String getUserInfo(@RequestParam("id")String id, @RequestParam("name")String name);
    @RequestMapping(value = "/user/test", method = RequestMethod.GET)
    public String queryBy(@RequestParam Map<String, Object> param);
}
