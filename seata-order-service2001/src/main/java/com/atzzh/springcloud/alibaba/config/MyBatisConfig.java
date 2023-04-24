package com.atzzh.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.atzzh.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
