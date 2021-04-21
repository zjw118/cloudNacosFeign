package com.cloud.nacos.pro.controller;

import com.cloud.nacos.client.ServiceFeignClient;
import com.cloud.nacos.common.result.RestfulResult;
import com.cloud.nacos.common.utils.CommUtils;
import com.cloud.nacos.pro.entity.ServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 微服务控制器
 *
 * @author Zhaojingwei
 * @date 2021/3/18
 */
@RestController
public class HelloController {

    @Autowired
    ServiceFeignClient serviceFeignClient;

    @RequestMapping( "/consumerService")
    public void login(HttpServletResponse response, HttpServletRequest request, @RequestBody ServiceInfo serviceInfo) {

        RestfulResult restfulResult =serviceFeignClient.hello(serviceInfo);

        CommUtils.printDataJason(response, restfulResult);
    }


}
