package com.liumm.controller;

import com.liumm.feign.IProducerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述: 消息消费者
 *
 * @Author liumm
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @Date 2019-06-22 14:15
 */
@RestController
@RequestMapping("/consumerController")
public class ConsumerController {

    @Autowired
    private IProducerFeign iProducerFeign;

    @GetMapping("/getMessage/{msg}")
    public String getMessage(@PathVariable(name = "msg") String msg) {
        return iProducerFeign.getMsg(msg);
    }


}
