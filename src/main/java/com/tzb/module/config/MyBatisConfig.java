package com.tzb.module.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Create by zhatang on 2020/12/1.
 */
@Configuration
@MapperScan("com.tzb.module.mbg.mapper")
public class MyBatisConfig {
}
