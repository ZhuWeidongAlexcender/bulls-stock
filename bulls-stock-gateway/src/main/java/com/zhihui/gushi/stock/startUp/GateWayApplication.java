package com.zhihui.gushi.stock.startUp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author @ZhuWeidong
 * @className GateWayApplication
 * @description TODO
 * @date 2023/11/22$ 23:41$
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages =  {"com.zhihui.gushi"})
@Slf4j
public class GateWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class,args);
        log.info("-----------网关启动成功-----------");
    }
}
