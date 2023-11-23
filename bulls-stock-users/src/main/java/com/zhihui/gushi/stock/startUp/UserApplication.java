package com.zhihui.gushi.stock.startUp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author @ZhuWeidong
 * @className UserApplication
 * @description TODO
 * @date $ $
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.zhihui.gushi"})
@Slf4j
@RestController
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
        log.info("-----------用户项目启动成功-----------");
    }

    /**
     * 提供访问测试接口， 支持POST和GET
     **/
    @RequestMapping("/welcome")
    public String welcome() {
        return "welcome bulls stock platform! !";
    }
}
