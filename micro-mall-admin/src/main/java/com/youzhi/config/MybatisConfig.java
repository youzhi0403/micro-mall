package com.youzhi.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author cwj
 * @date 2019/12/19 15:55
 * mybatis配置类
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.youzhi.mapper","com.youzhi.dao"})
public class MybatisConfig {
}
