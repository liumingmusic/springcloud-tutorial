package com.liumm.feign;

import config.FeignLogConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 描述: Feign调用接口
 *
 * @Author liumm
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @Date 2019-06-22 14:00
 */

@Component
@FeignClient(value = "microservice-eureka-client-producer", configuration = FeignLogConfiguration.class, fallback = IProducerFeignFallback.class)
public interface IProducerFeign {

    /**
     * 接口调用
     *
     * @param name 参数
     * @return 消息加前缀
     */
    @GetMapping("/producerController/getTwo/{name}")
    String getTwo(@PathVariable(name = "name") String name);

}

@Component
class IProducerFeignFallback implements IProducerFeign {
    @Override
    public String getTwo(String name) {
        return "default_getTwo + " + name;
    }
}