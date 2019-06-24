package com.liumm.controller;

import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/getMsg/{name}")
    public String getMsg(@PathVariable(name = "name") String name) {
        return "hello " + name;
    }

}
