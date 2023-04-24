package com.atzzh.springcloud.alibaba.service;

import com.atzzh.springcloud.entities.CommonResult;
import com.atzzh.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

@Component//一定要加
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }
}
