package com.hdl.feignserver.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//value:是要调用的服务名称，fallback:是熔断处理类
//直接调用了up_server服务
@FeignClient(value = "CLIENT",fallback = HystricError.class)
public interface FeignService {

    //调用远程服务的资源路径
    @RequestMapping("/action")
    String action();

}
