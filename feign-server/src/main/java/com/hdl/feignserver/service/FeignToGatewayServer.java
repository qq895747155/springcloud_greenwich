package com.hdl.feignserver.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//通过调用gateway，然后gateway调用up_server
@FeignClient(value = "gateway", fallback = HystricError.class)
public interface FeignToGatewayServer {

    //调用远程服务的资源路径
    @RequestMapping("/c/action")
    String action();
}
