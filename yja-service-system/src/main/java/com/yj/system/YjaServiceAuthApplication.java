package com.yj.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yangjian
 * @version 1.0.0
 * @email 2628168756@qq.com
 * @date 2024/3/2 20:25
 */
@SpringBootApplication
@MapperScan("com.yj.system.mapper")
public class YjaServiceAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(YjaServiceAuthApplication.class, args);
    }
}
