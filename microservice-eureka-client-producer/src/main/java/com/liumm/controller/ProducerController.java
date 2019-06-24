package com.liumm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: 服务接口提供者
 *
 * @Author liumm
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @Date 2019-06-22 14:00
 */
@RestController
@RequestMapping("/producerController")
public class ProducerController {

    /**
     * @param name 参数
     * @return 返回加入前缀
     */
    @GetMapping("/getOne/{name}")
    public String getOne(@PathVariable(name = "name") String name) {
        return "getOne " + name;
    }

    /**
     * @param name 参数
     * @return 返回加入前缀
     */
    @GetMapping("/getTwo/{name}")
    public String getTwo(@PathVariable(name = "name") String name) {
        return "getTwo " + name;
    }

}
