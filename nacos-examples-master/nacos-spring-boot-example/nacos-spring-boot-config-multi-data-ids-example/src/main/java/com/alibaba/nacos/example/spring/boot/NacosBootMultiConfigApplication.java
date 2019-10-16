package com.alibaba.nacos.example.spring.boot;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Document: https://nacos.io/zh-cn/docs/quick-start-spring-boot.html
 * <p>
 * Nacos 控制台添加配置：
 * <p>
 * Data ID：example
 * <p>
 * Group：DEFAULT_GROUP
 * <p>
 * 配置内容：useLocalCache=true
 */
@SpringBootApplication
@NacosPropertySource(dataId = "alibaba-nacos-config-client.properties", autoRefreshed = true)
@NacosPropertySource(dataId = "alibaba-nacos-config-client-dev.properties", autoRefreshed = true)
@NacosPropertySource(dataId = "zk.yaml", autoRefreshed = true)
public class NacosBootMultiConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosBootMultiConfigApplication.class, args);
    }
}