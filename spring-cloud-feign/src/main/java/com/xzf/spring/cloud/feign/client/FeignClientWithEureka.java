package com.xzf.spring.cloud.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 配合使用Eureka,FeignClient中的value名为Eureka上注册的服务名
 */
@FeignClient(value = "user-center")
public interface FeignClientWithEureka {

    @GetMapping(value = "/user/{id}")
    public String getUserInfoById(@PathVariable(value="id") String userId);

}
