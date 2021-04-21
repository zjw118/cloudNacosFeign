package com.cloud.nacos.client;

/**
 * 用于发生熔断时候的处理
 *
 * @author Zhaojingwei
 * @date 2021/3/19
 */

import com.cloud.nacos.common.result.RestfulResult;
import com.cloud.nacos.pro.entity.ServiceInfo;
import org.springframework.stereotype.Component;

@Component
public class ServiceFallback implements ServiceFeignClient{

    @Override
    public RestfulResult hello(ServiceInfo serviceInfo) {
        RestfulResult result = new RestfulResult();
        result.setData("发生熔断，服务调用失败");
        return result;
    }


}
