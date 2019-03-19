package com.hdl.ribbonserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//springcloud 分布式微服务一般使用规则如下：
//1。所有服务都注册到注册中心
//2。所有的服务配置都使用配置中心
//3。所有服务间的调用都通过gateway转发，例如：feign --> gateway --> up_server

@SpringBootApplication
@EnableDiscoveryClient
//开启熔断器
@EnableHystrix
public class RibbonServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonServerApplication.class, args);
    }

    //注入RestTemplate到springcloud容器，用来远程调用
    @Bean
    //@LoadBalanced注解表明这个restRemplate开启负载均衡的功能
    @LoadBalanced
    public RestTemplate template(){
        return new RestTemplate();
    }

}
