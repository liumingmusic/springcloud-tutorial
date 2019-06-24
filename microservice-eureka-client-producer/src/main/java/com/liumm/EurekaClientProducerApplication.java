package com.liumm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 描述: 项目启动类
 *
 * @Author liumm
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @Date 2019-06-22 13:58
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProducerApplication.class, args);
    }

}
