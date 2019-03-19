package com.hdl.feignserver.controller;

import com.hdl.feignserver.service.FeignService;
import com.hdl.feignserver.service.FeignToGatewayServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignServerController {

    @Autowired
    FeignService feignService;

    @Autowired
    FeignToGatewayServer feignToGatewayServer;

    @RequestMapping("/action")
    public String action(){
        return feignService.action();
    }

    @RequestMapping("/gateway/action")
    public String action_gateway(){
        return feignToGatewayServer.action();
    }
}
