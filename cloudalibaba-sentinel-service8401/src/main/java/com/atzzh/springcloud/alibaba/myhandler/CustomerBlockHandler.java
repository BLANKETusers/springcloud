package com.atzzh.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atzzh.springcloud.entities.CommonResult;

public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException blockException){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler---1");
    }

    public static CommonResult handleException2(BlockException blockException){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler---2");
    }
}
