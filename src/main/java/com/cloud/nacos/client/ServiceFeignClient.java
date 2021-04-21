package com.cloud.nacos.client;

import com.cloud.nacos.common.result.RestfulResult;
import com.cloud.nacos.pro.entity.ServiceInfo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "cloudNacos", fallback=ServiceFallback.class) //这里的value对应调用服务的spring.applicatoin.name
public interface ServiceFeignClient {


    @RequestMapping(value = "/service/hello")
    RestfulResult hello(@RequestBody ServiceInfo serviceInfo);

}
