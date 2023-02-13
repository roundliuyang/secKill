package com.along.seckill.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huanglong
 * @date 2020-02-23
 */
@RestController
public class LBController {

    @Value("${server.port}")
    private String port ;


    /**
     * 根据不同端口的应用来测试负载均衡
     * @return
     */
    @GetMapping("/lb")
    @ResponseBody
    public String lb(){
        return "this port is:" + port ;
    }

}
