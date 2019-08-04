package com.liumm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 描述: 监控请求面板
 *
 * @Author liumm
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @Date 2019-06-23 12:59
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableTurbine
@EnableHystrixDashboard
public class EurekaClientDashboardApplication {

    //http://localhost:9000/hystrix
    //http://localhost:9000/turbine.stream
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientDashboardApplication.class, args);
    }

}
