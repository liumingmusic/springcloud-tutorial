package com.liumm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 描述: 微服务注册中心 eureka client
 *
 * @Author liumm
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @Date 2019-06-21 18:35
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class EurekaClientZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientZuulApplication.class, args);
    }

}
