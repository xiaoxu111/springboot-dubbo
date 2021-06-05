package com.aliwo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

// 开启dubbo的自动配置
@EnableDubboConfiguration
// 开启当前应用的缓存
@EnableCaching
@SpringBootApplication
public class SpringbootDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboApplication.class, args);
    }

}
