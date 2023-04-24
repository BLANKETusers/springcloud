package com.atzzh.springcloud.alibaba.service;

import com.atzzh.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


//远程调用库存微服务
/*
* 　　地址1：http://localhost:8989/SSSP/emps?pageNo=2

　　地址2：http://localhost:8989/SSSP/emp/7

　　如果想获取地址1中的 pageNo的值 ‘2’ ，则使用  @RequestParam ，

　　如果想获取地址2中的 emp/7 中的 ‘7 ’   则使用 @PathVariable
* */

//找seata-storage-service/storage/decrease
@FeignClient("seata-storage-service")
public interface StorageService {
    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId")Long productId,
                          @RequestParam("count")Integer count);
}
