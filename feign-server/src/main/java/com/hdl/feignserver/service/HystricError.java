package com.hdl.feignserver.service;

import org.springframework.stereotype.Component;

//熔断器失败处理类
@Component
public class HystricError implements FeignService,FeignToGatewayServer {
    @Override
    public String action() {
        return "Feign:服务不可用！";
    }
}
